package nl.scmm.superelf.services;

import nl.scmm.superelf.models.Club;
import nl.scmm.superelf.repositories.IClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {

    private final IClubRepository clubRepository;

    @Autowired
    public ClubService(IClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<Club> getClubs() {
        return clubRepository.findAll();
    }
}
