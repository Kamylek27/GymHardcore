package com.gh.gymhardcore.dto;

import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public class TrainingDto {

    private LocalDate localDate;

    private TypeTraining typeTraining;

    private MainExercises mainExercises;

    private double oneRm;
}
