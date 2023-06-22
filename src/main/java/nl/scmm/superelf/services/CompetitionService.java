package nl.scmm.superelf.services;

import nl.scmm.superelf.models.Competition;
import nl.scmm.superelf.repositories.ICompetitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {

    private final ICompetitionRepository competitionRepository;

    @Autowired
    public CompetitionService(ICompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    public List<Competition> getCompetitions() {
        return competitionRepository.findAll();
    }
}
