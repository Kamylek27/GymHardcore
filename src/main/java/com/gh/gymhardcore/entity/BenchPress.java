package com.gh.gymhardcore.entity;

import com.gh.gymhardcore.enums.ChestExercise;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
public class BenchPress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long benchPressID;

    private double oneRepMax;

    private double tM;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;
}
