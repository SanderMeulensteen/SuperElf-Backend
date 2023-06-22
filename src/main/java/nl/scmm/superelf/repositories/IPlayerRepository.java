package nl.scmm.superelf.repositories;

import nl.scmm.superelf.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlayerRepository extends JpaRepository<Player, Integer> {
}
