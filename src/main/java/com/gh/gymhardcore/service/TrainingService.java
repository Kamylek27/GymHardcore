package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.BenchPress;
import com.gh.gymhardcore.entity.Training;
import com.gh.gymhardcore.repository.BenchPressRepository;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    private final BenchPressRepository benchPressRepository;

    private static final double ROUND = 2.5;

    private static final double TM = 0.9;

    @Autowired
    public TrainingService(BenchPressRepository benchPressRepository) {
        this.benchPressRepository = benchPressRepository;
    }


    public BenchPress createBenchPressMax(BenchPress benchPress) {

        benchPress.setTM(countTM(benchPress.getOneRepMax()));
        return benchPressRepository.save(benchPress);
    }


    private double countTM(double oneRepMax) {
        return Math.round((oneRepMax * TM) / ROUND) * ROUND;
    }


}
