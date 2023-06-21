package nl.scmm.superelf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clubId;
    private String clubName;
    @OneToOne
    @JoinColumn(name = "competition_competition_id")
    private Competition competition;

    public Club() {
    }

    public Club(Integer clubId, String clubName, Competition competition) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.competition = competition;
    }

    public Club(String clubName, Competition competition) {
        this.clubName = clubName;
        this.competition = competition;
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

    @Override
    public String toString() {
        return "Club{" +
                "clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", competition=" + competition +
                '}';
    }
}
