package tn.esprit.autoloc.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.domain.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}
