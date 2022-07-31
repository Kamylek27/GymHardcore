package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.repository.ChestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChestService {

    private final ChestRepository chestRepository;

    public List<Chest> getAllChestExercise() {
        return chestRepository.findAll();
    }
}
