package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.dto.ChestDto;
import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.service.ChestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chest")
public class ChestController {
    private ChestService chestService;

    @GetMapping("all")
    public List<Chest> getAllChest() {
        return chestService.getAllChestExercise();
    }

    @PostMapping("/create")
    public void createChestExercise(@RequestBody ChestDto chestDto) {
        chestService.createChestExercise(chestDto);
    }

    @PutMapping("/update")
    public void updateChestExercise() {

    }

}
