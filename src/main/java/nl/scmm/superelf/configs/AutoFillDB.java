package nl.scmm.superelf.configs;

import nl.scmm.superelf.models.*;
import nl.scmm.superelf.repositories.*;
import nl.scmm.superelf.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AutoFillDB {

    public final ClubService clubService;
    public final CompetitionService competitionService;
    public final PlayerService playerService;
    public final UserService userService;

    @Autowired
    public AutoFillDB(ClubService clubService, CompetitionService competitionService, PlayerService playerService, UserService userService) {
        this.clubService = clubService;
        this.competitionService = competitionService;
        this.playerService = playerService;
        this.userService = userService;
    }

    @Bean
    CommandLineRunner commandLineRunner(IClubRepository clubRepository, ICompetitionRepository competitionRepository, IPlayerRepository playerRepository, IUserRepository userRepository) {
        return args -> {
            Competition noCompetition = new Competition(1,"No Competition","No Country");
            Competition eredivisie = new Competition(2, "Eredivisie", "Netherlands");
            Club noClub = new Club(1, "No Club", noCompetition,"https://www.fifacm.com/content/media/imgs/fifa22/teams/256/l111592.png");
            Club psv = new Club(2, "PSV", eredivisie, "https://d3et0fncpz2hhr.cloudfront.net/clubs/psv/_80x80_fit_center-center_85_none/logo-psv.png");
            Club ajax = new Club(3,"Ajax", eredivisie, "https://d3et0fncpz2hhr.cloudfront.net/clubs/ajax/_80x80_fit_center-center_85_none/logo-ajax.png");
            Club feyenoord = new Club(4,"Feyenoord", eredivisie, "https://d3et0fncpz2hhr.cloudfront.net/clubs/feyenoord/_80x80_fit_center-center_85_none/logo-feyenoord.png");
            Club vitesse = new Club(5,"Vitesse",eredivisie, "https://d3et0fncpz2hhr.cloudfront.net/clubs/vitesse/_80x80_fit_center-center_85_none/logo-vitesse.png");
            Player p1 = new Player(1,"Melle Meulensteen", Position.midfielder,vitesse,2500000);
            Player p2 = new Player(2,"Wout Brama", Position.midfielder,noClub, 500000);
            Player p3 = new Player(3,"Xavi Simons",Position.midfielder,psv, 6000000);
            Player p4 = new Player(4,"Walter Benítez",Position.goalkeeper,psv, 3500000);
            Player p5 = new Player(5,"Jurriën Timber",Position.defender,ajax, 4500000);
            Player p6 = new Player(6,"Santiago Giménez",Position.forward,feyenoord, 5000000);
            competitionRepository.save(noCompetition);
            competitionRepository.save(eredivisie);
            clubRepository.save(noClub);
            clubRepository.save(psv);
            clubRepository.save(ajax);
            clubRepository.save(feyenoord);
            clubRepository.save(vitesse);
            playerRepository.save(p1);
            playerRepository.save(p2);
            playerRepository.save(p3);
            playerRepository.save(p4);
            playerRepository.save(p5);
            playerRepository.save(p6);
            User admin = new User(1,"Admin","Ad","Min","test","admin@superelf.nl");
            User u1 = new User(2,"SandersonM95","Sander","Meulensteen","test","sander@sandermeulensteen.nl");
            User u2 = new User(3,"ScmM95","Scm","Meulensteen", "test","scm@sandermeulensteen.nl");
            userRepository.save(admin);
            userRepository.save(u1);
            userRepository.save(u2);
        };
    }

}
