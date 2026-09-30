package tn.esprit.autoloc.autoloc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.autoloc.autoloc.domain.CategorieVehicule;
import tn.esprit.autoloc.autoloc.domain.StatutVehicule;
import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.repository.VehiculeRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;

@SpringBootApplication
public class AutoLocApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoLocApplication.class, args);
    }

    @Bean
    CommandLineRunner initData(VehiculeRepository vehiculeRepository) {
        return args -> {
            if (vehiculeRepository.count() > 0) {
                return;
            }

            vehiculeRepository.save(new Vehicule(null, "123 TUN 456", "Peugeot", "208",
                    CategorieVehicule.CITADINE, new BigDecimal("80.00"), StatutVehicule.DISPONIBLE, null, new HashSet<>(), new ArrayList<>()));

            vehiculeRepository.save(new Vehicule(null, "789 TUN 321", "Renault", "Clio",
                    CategorieVehicule.CITADINE, new BigDecimal("70.00"), StatutVehicule.DISPONIBLE, null, new HashSet<>(), new ArrayList<>()));

            vehiculeRepository.save(new Vehicule(null, "456 TUN 852", "Toyota", "Corolla",
                    CategorieVehicule.BERLINE, new BigDecimal("120.00"), StatutVehicule.DISPONIBLE, null, new HashSet<>(), new ArrayList<>()));
        };
    }
}
