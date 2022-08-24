package com.gh.gymhardcore.entity;

import com.gh.gymhardcore.enums.ChestExercise;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Back {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long backId;

    @Enumerated(EnumType.STRING)
    private ChestExercise chestExercise;

    private double maxWeight;

    private int sets;

    private int repeats;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

}
