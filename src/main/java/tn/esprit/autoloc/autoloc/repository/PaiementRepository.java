package tn.esprit.autoloc.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
