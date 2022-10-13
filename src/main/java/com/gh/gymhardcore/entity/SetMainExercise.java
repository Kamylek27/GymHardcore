package com.gh.gymhardcore.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SetMainExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long setsId;

    private double percent;

    private double weight;

    private int sets;

    private int reps;
}
