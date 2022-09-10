package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.Exercise;
import com.gh.gymhardcore.repository.ExerciseRepository;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    private ExerciseRepository exerciseRepository;


    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

}
