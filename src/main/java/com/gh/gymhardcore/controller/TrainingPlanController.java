package com.gh.gymhardcore.controller;


import com.gh.gymhardcore.entity.TrainingPlan;
import com.gh.gymhardcore.service.TrainingPlanService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TrainingPlanController {

    private final TrainingPlanService trainingPlanService;

    @GetMapping("/all")
    public List<TrainingPlan> getAllPlanTraining() {
        return trainingPlanService.getAllTrainingPlan();
    }




}
