package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/main")
public class MainExerciseController {

    private MainService mainService;

    @PostMapping("/create")
    public MainExercise createMainExercise(@RequestBody MainExercise mainExercise) {
        return mainService.createMainExercise(mainExercise);
    }

    @PutMapping("/update")
    public void updateChestExercise() {
    }

}
