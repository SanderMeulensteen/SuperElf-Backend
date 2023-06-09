package nl.scmm.superelf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer playerId;
    private String playerName;
    @Enumerated(value = EnumType.STRING)
    private Position position;
    @ManyToOne
    @JoinColumn(name = "clubId")
    private Club club;

    public Player() {
    }

    public Player(Integer playerId, String playerName, Position position, Club club) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.position = position;
        this.club = club;
    }

    public Player(String playerName, Position position, Club club) {
        this.playerName = playerName;
        this.position = position;
        this.club = club;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", position=" + position +
                ", club=" + club +
                '}';
    }
}
