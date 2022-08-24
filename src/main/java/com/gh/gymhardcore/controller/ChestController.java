package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.dto.ChestDto;
import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.repository.ChestRepository;
import com.gh.gymhardcore.service.ChestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chest")
public class ChestController {
    private ChestService chestService;

    @PostMapping("/create")
    public Chest createChestExercise(@RequestBody Chest chest) {
        return chestService.createChestExercise(chest);
    }

    @PutMapping("/update")
    public void updateChestExercise() {
    }

}
