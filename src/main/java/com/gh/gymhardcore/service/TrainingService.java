package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.Training;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    private final TrainingRepository trainingRepository;

    @Autowired
    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    public Training createTraining(Training training) {
        return trainingRepository.save(training);
    }


}
