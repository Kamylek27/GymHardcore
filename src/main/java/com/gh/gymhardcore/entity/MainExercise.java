package com.gh.gymhardcore.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class MainExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long benchPressID;

    private String name;

    private double oneRepMax;

    private double tM;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;
}
