package nl.scmm.superelf.models;

import jakarta.persistence.Table;

@Table(name = "team")
public class Team {
    private Integer teamId;
    private Competition competition;
    private User user;
    private Integer points;

    public Team() {
    }

    public Team(Integer teamId, Competition competition, User user, Integer points) {
        this.teamId = teamId;
        this.competition = competition;
        this.user = user;
        this.points = points;
    }

    public Team(Competition competition, User user, Integer points) {
        this.competition = competition;
        this.user = user;
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

    @Override
    public String toString() {
        return "Team{" +
                "teamId=" + teamId +
                ", competition=" + competition +
                ", user=" + user +
                ", points=" + points +
                '}';
    }
}
