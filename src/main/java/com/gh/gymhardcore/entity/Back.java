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
    private Long id;

    @Enumerated(EnumType.STRING)
    private ChestExercise chestExercise;

    private double maxWeight;

    private int sets;

    private int repeats;

}
