package com.gh.gymhardcore.dto;

import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCreateRequest {

    private LocalDate localDate;

    private TypeTraining typeTraining;

    private MainExercises mainExercises;

    private double oneRm;
}
