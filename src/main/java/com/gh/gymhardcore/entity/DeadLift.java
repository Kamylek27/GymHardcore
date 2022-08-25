package com.gh.gymhardcore.entity;

import com.gh.gymhardcore.enums.ChestExercise;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DeadLift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deadLiftId;

    private double oneRepMax;

    private double tM;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;
}
