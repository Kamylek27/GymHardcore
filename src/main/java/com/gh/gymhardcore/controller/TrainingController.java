package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.dto.TrainingCreateRequest;
import com.gh.gymhardcore.dto.TrainingUpdateRequest;
import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/training")
public class TrainingController {

    private final TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }


    @PostMapping("/create")
    public MainExercise createTraining(@RequestBody TrainingCreateRequest trainingCreateRequest) {
        return trainingService.createTraining(trainingCreateRequest);
    }

    @PutMapping("/update/{id}")
    public MainExercise updateTraining(@PathVariable("id") Long id, @RequestBody TrainingUpdateRequest trainingUpdateRequest) {
        return trainingService.updateTraining(id, trainingUpdateRequest);
    }


}

