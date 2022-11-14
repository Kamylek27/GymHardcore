package com.gh.gymhardcore.dto;

import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingUpdateRequest {

    private Long id;

    private LocalDate localDate;

    private double oneRm;
}
