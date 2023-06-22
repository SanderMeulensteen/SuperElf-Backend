package nl.scmm.superelf.services;

import nl.scmm.superelf.models.Poule;
import nl.scmm.superelf.repositories.IPouleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PouleService {

    private final IPouleRepository pouleRepository;

    @Autowired
    public PouleService(IPouleRepository pouleRepository) {
        this.pouleRepository = pouleRepository;
    }

    public List<Poule> getPoules() {
        return pouleRepository.findAll();
    }
}
