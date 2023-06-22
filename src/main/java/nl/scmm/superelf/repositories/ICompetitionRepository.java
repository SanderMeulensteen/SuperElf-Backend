package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompetitionRepository extends JpaRepository<Competition, Integer> {
}
