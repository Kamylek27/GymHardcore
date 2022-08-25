package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.entity.BenchPress;
import com.gh.gymhardcore.service.TrainingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/chest")
public class ChestController {
    private TrainingService trainingService;

    @PostMapping("/create")
    public BenchPress createChestExercise(@RequestBody BenchPress benchPress) {
        return trainingService.createBenchPressMax(benchPress);
    }

    @PutMapping("/update")
    public void updateChestExercise() {
    }

}
