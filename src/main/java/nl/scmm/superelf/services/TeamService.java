package nl.scmm.superelf.services;

import nl.scmm.superelf.models.Team;
import nl.scmm.superelf.repositories.ITeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final ITeamRepository teamRepository;

    @Autowired
    public TeamService(ITeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getTeams() {
        return teamRepository.findAll();
    }
}
