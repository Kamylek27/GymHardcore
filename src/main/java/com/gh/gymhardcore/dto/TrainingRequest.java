package com.gh.gymhardcore.dto;

import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class TrainingRequest {

    private LocalDate localDate;

    private TypeTraining typeTraining;

    private MainExercises mainExercises;

    private double oneRm;
}
