package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Matchround;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMatchroundRepository extends JpaRepository<Matchround, Integer> {
}
