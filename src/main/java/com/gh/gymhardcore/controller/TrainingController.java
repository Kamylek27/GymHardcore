package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.dto.TrainingRequest;
import com.gh.gymhardcore.entity.Training;
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
    public Training createTraining(@RequestBody TrainingRequest trainingRequest) {
        return trainingService.createTraining(trainingRequest);
    }

    @PutMapping("/update/{id}")
    public Training updateTraining(@PathVariable("id") Long id, @RequestBody TrainingRequest trainingRequest) {
        return trainingService.updateTraining(id, trainingRequest);
    }


}

