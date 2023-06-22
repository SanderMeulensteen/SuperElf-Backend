package nl.scmm.superelf.controllers;

import nl.scmm.superelf.models.Poule;
import nl.scmm.superelf.services.PouleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/poules")
public class PouleController {

    private final PouleService pouleService;

    @Autowired
    public PouleController(PouleService pouleService) {
        this.pouleService = pouleService;
    }

    @GetMapping
    public List<Poule> getPoules() {
        return pouleService.getPoules();
    }
}
