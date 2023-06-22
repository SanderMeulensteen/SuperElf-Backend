package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeamRepository extends JpaRepository<Team, Integer> {
}
