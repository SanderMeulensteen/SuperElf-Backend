package nl.scmm.superelf.models;

import jakarta.persistence.*;

@Entity
@Table(name = "matchround")
public class Matchround {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchroundId;
}
