package nl.scmm.superelf.models;

import jakarta.persistence.Table;

@Table(name = "poule")
public class Poule {
    private Integer pouleId;
    private Competition competition;
    private String pouleName;

    public Poule() {
    }

    public Poule(Integer pouleId, Competition competition, String pouleName) {
        this.pouleId = pouleId;
        this.competition = competition;
        this.pouleName = pouleName;
    }

    public Poule(Competition competition, String pouleName) {
        this.competition = competition;
        this.pouleName = pouleName;
    }

    public Integer getPouleId() {
        return pouleId;
    }

    public void setPouleId(Integer pouleId) {
        this.pouleId = pouleId;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public String getPouleName() {
        return pouleName;
    }

    public void setPouleName(String pouleName) {
        this.pouleName = pouleName;
    }

    @Override
    public String toString() {
        return "Poule{" +
                "pouleId=" + pouleId +
                ", competition=" + competition +
                ", pouleName='" + pouleName + '\'' +
                '}';
    }
}
