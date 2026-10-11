package tn.esprit.autoloc.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.domain.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
