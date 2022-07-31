package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.repository.ChestRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class ChestService {

    private ChestRepository chestRepository;

    public List<Chest> getAllChestExercise() {
        return chestRepository.findAll();
    }
}
