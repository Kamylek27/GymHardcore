package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.entity.Exercise;
import com.gh.gymhardcore.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    private ExerciseService exerciseService;

    @Autowired
    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }


    @PostMapping("/create")
    public Exercise createExercise(Exercise exercise) {
        return exerciseService.createExercise(exercise);
    }


}
