package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.repository.MainExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private static final double ROUND = 2.5;
    private static final double TM = 0.9;
    private final MainExerciseRepository mainExerciseRepository;

    @Autowired
    public MainService(MainExerciseRepository mainExerciseRepository) {
        this.mainExerciseRepository = mainExerciseRepository;
    }

    public MainExercise createMainExercise(MainExercise mainExercise) {

        mainExercise.setTM(countTM(mainExercise.getOneRepMax()));
        return mainExerciseRepository.save(mainExercise);
    }

    private double countTM(double oneRepMax) {
        return Math.round((oneRepMax * TM) / ROUND) * ROUND;
    }
}
