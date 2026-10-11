package tn.esprit.autoloc.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.autoloc.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
