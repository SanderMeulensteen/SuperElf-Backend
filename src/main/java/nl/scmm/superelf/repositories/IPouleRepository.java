package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Poule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPouleRepository extends JpaRepository<Poule, Integer> {
}
