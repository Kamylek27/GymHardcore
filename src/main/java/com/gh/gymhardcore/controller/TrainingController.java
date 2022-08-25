package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.entity.Training;
import com.gh.gymhardcore.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/training")
public class TrainingController {

    private final TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }


    @PostMapping("/create")
    public Training createTraining(@RequestBody Training training) {
        return trainingService.createTraining(training);
    }


}

