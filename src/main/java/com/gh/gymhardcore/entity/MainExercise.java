package com.gh.gymhardcore.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainExercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate localDate;

    @Enumerated(EnumType.STRING)
    private TypeTraining typeTraining;

    @Enumerated(EnumType.STRING)
    private MainExercises mainExercises;

    private double oneRm;

    private double tM;

    @ElementCollection
    private List<Double> weight;

}
