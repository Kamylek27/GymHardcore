package com.gh.gymhardcore.service;

import com.gh.gymhardcore.dto.TrainingCreateRequest;
import com.gh.gymhardcore.dto.TrainingUpdateRequest;
import com.gh.gymhardcore.entity.Training;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TrainingService {

    private final TrainingRepository trainingRepository;
    private static final double TM = 0.9;
    private static final double ROUNDING = 2.5;
    private static final List<Integer> percents = Arrays.asList(40, 50, 60, 65, 75, 85);

    @Autowired
    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    public Training createTraining(TrainingCreateRequest trainingCreateRequest) {
        Training training = new Training();
        System.out.println(trainingCreateRequest.getOneRm());

        training.setTypeTraining(trainingCreateRequest.getTypeTraining());
        training.setLocalDate(trainingCreateRequest.getLocalDate());
        training.setOneRm(trainingCreateRequest.getOneRm());
        training.setMainExercises(trainingCreateRequest.getMainExercises());
        training.setTM(countingTM(trainingCreateRequest.getOneRm()));
        training.setWeight(countingWeights(countingTM(trainingCreateRequest.getOneRm())));

        trainingRepository.save(training);

        return training;
    }

    public Training updateTraining(Long id, TrainingUpdateRequest trainingUpdateRequest) {
        Training training = trainingRepository.findById(id).orElse(null);

        if (training != null) {
            training.setLocalDate(trainingUpdateRequest.getLocalDate());
            training.setOneRm(trainingUpdateRequest.getOneRm());
            training.setTM(countingTM(trainingUpdateRequest.getOneRm()));
            training.setWeight(countingWeights(countingTM(trainingUpdateRequest.getOneRm())));
            trainingRepository.save(training);
        }
        return training;
    }

    private double countingTM(double oneRm) {
        return Math.round(oneRm * TM);
    }

    //percent counting to check
    private List<Double> countingWeights(double tM) {
        List<Double> weights = new ArrayList<>();

        for (Integer p : percents) {
            double percent = (double) p / 100;
            weights.add((double) Math.round((percent * tM) / ROUNDING) * ROUNDING);
        }

        return weights;
    }
}
