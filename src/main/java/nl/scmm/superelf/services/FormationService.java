package nl.scmm.superelf.services;

import nl.scmm.superelf.models.Formation;
import nl.scmm.superelf.repositories.IFormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {

    private final IFormationRepository formationRepository;

    @Autowired
    public FormationService(IFormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public List<Formation> getFormations() {
        return formationRepository.findAll();
    }
}
