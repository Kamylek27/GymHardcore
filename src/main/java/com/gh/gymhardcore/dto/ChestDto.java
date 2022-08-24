package com.gh.gymhardcore.dto;

import com.gh.gymhardcore.enums.ChestExercise;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ChestDto {

    private ChestExercise chestExercise;
    private double maxWeight;
    private int sets;
    private int repeats;
    private Long trainingId;

}
