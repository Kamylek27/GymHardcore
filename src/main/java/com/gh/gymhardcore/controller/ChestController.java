package com.gh.gymhardcore.controller;

import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.service.ChestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
