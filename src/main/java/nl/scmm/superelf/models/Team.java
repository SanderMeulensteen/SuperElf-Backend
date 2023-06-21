package nl.scmm.superelf.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teamId;
    @OneToOne
    @JoinColumn(name = "competition_competition_id")
    private Competition competition;
    @OneToOne
    @JoinColumn(name = "user_user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "formation_formation_id")
    private Formation formation;
    private Integer points;
    private List<Player> players;

    public Team() {
    }

    public Team(Integer teamId, Competition competition, User user, Formation formation, Integer points) {
        this.teamId = teamId;
        this.competition = competition;
        this.user = user;
        this.formation = formation;
        this.points = points;
    }

    public Team(Competition competition, User user, Formation formation, Integer points) {
        this.competition = competition;
        this.user = user;
        this.formation = formation;
        this.points = points;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", competition=" + competition +
                ", user=" + user +
                ", formation=" + formation +
                ", points=" + points +
                ", players=" + players +
                '}';
    }
}
