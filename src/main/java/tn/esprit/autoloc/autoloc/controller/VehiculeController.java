package tn.esprit.autoloc.autoloc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.autoloc.domain.Vehicule;
import tn.esprit.autoloc.autoloc.service.IVehiculeService;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {
    private final IVehiculeService vehiculeService;

    public VehiculeController(IVehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    @GetMapping
    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    @GetMapping("/{idVehicule}")
    public ResponseEntity<Vehicule> retrieveVehicule(@PathVariable("idVehicule") Long idVehicule) {
        Vehicule vehicule = vehiculeService.retrieveVehicule(idVehicule);
        return vehicule == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(vehicule);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicule addVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.addVehicule(vehicule);
    }

    @PutMapping
    public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.updateVehicule(vehicule);
    }

    @DeleteMapping("/{idVehicule}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeVehicule(@PathVariable("idVehicule") Long idVehicule) {
        vehiculeService.removeVehicule(idVehicule);
    }

    @PostMapping("/batch")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Vehicule> addVehicules(@RequestBody List<Vehicule> vehicules) {
        return vehiculeService.addVehicules(vehicules);
    }
}
