package nl.scmm.superelf.services;

import nl.scmm.superelf.models.Player;
import nl.scmm.superelf.repositories.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final IPlayerRepository playerRepository;

    @Autowired
    public PlayerService(IPlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }
}
