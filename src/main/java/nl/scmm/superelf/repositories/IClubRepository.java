package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClubRepository extends JpaRepository<Club, Integer> {
}
