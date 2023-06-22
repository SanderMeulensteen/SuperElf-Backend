package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormationRepository extends JpaRepository<Formation, Integer> {
}
