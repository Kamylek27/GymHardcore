package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.dto.TrainingCreateRequest;
import com.gh.gymhardcore.dto.TrainingUpdateRequest;
import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.service.TrainingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/training")
public class TrainingController {

    private final TrainingServiceImpl trainingServiceImpl;

    @Autowired
    public TrainingController(TrainingServiceImpl trainingServiceImpl) {
        this.trainingServiceImpl = trainingServiceImpl;
    }


    @PostMapping("/create")
    public MainExercise createTraining(@RequestBody TrainingCreateRequest trainingCreateRequest) {
        return trainingServiceImpl.createTraining(trainingCreateRequest);
    }

    @PutMapping("/update/{id}")
    public MainExercise updateTraining(@RequestBody TrainingUpdateRequest trainingUpdateRequest) {
        return trainingServiceImpl.updateTraining(trainingUpdateRequest);
    }


}

