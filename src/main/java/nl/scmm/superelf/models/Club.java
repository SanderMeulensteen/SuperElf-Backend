package nl.scmm.superelf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clubId;
    private String clubName;
    @ManyToOne
    @JoinColumn(name = "competitionId")
    private Competition competition;
    private String logo;

    public Club() {
    }

    public Club(Integer clubId, String clubName, Competition competition, String logo) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.competition = competition;
        this.logo = logo;
    }

    public Club(String clubName, Competition competition, String logo) {
        this.clubName = clubName;
        this.competition = competition;
        this.logo = logo;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", competition=" + competition +
                ", logo=" + logo +
                '}';
    }
}
