package com.gh.gymhardcore.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idExercise;

    String name;

    double weight;

    double repeats;

    int sets;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;
}
