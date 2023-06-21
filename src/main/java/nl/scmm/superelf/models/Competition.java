package nl.scmm.superelf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "competition")
public class Competition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer competitionId;
    private String competitionName;
    private String country;

    public Competition() {
    }

    public Competition(Integer competitionId, String competitionName, String country) {
        this.competitionId = competitionId;
        this.competitionName = competitionName;
        this.country = country;
    }

    public Competition(String competitionName, String country) {
        this.competitionName = competitionName;
        this.country = country;
    }

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Competition{" +
                "competitionId=" + competitionId +
                ", competitionName='" + competitionName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
