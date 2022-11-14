package com.gh.gymhardcore.service;

import com.gh.gymhardcore.dto.TrainingCreateRequest;
import com.gh.gymhardcore.dto.TrainingUpdateRequest;
import com.gh.gymhardcore.entity.MainExercise;

public interface TrainingService {

    MainExercise createTraining(TrainingCreateRequest trainingCreateRequest);

    MainExercise updateTraining(TrainingUpdateRequest trainingUpdateRequest);
}
