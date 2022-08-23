package com.gh.gymhardcore.service;

import com.gh.gymhardcore.dto.ChestDto;
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

    public Chest createChestExercise(ChestDto chestDto) {
        Chest chest = new Chest();

        chest.setChestExercise(chestDto.getChestExercise());
        chest.setSets(chestDto.getSets());
        chest.setRepeats(chestDto.getRepeats());
        chest.setMaxWeight(chest.getMaxWeight());

        return chest;
    }
}
