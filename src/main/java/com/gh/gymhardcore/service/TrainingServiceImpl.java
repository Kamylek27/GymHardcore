package com.gh.gymhardcore.service;

import com.gh.gymhardcore.dto.TrainingCreateRequest;
import com.gh.gymhardcore.dto.TrainingUpdateRequest;
import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.exception.TrainingNotFoundException;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService {

    private final TrainingRepository trainingRepository;
    private static final double TM = 0.9;
    private static final double ROUNDING = 2.5;
    private static final List<Integer> percents = Arrays.asList(40, 50, 60, 65, 75, 85);

    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    public MainExercise createTraining(TrainingCreateRequest trainingCreateRequest) {
        MainExercise mainExercise = new MainExercise();


        mainExercise.setTypeTraining(trainingCreateRequest.getTypeTraining());
        mainExercise.setLocalDate(trainingCreateRequest.getLocalDate());
        mainExercise.setOneRm(trainingCreateRequest.getOneRm());
        mainExercise.setMainExercises(trainingCreateRequest.getMainExercises());
        mainExercise.setTM(countingTM(trainingCreateRequest.getOneRm()));
        mainExercise.setWeight(countingWeights(countingTM(trainingCreateRequest.getOneRm())));


        trainingRepository.save(mainExercise);

        return mainExercise;
    }

    public MainExercise updateTraining(TrainingUpdateRequest trainingUpdateRequest) {
        MainExercise mainExercise = trainingRepository.findById(trainingUpdateRequest.getId()).orElseThrow(TrainingNotFoundException::new);

        mainExercise.setLocalDate(trainingUpdateRequest.getLocalDate());
        mainExercise.setOneRm(trainingUpdateRequest.getOneRm());
        mainExercise.setTM(countingTM(trainingUpdateRequest.getOneRm()));
        mainExercise.setWeight(countingWeights(countingTM(trainingUpdateRequest.getOneRm())));
        trainingRepository.save(mainExercise);

        return mainExercise;
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
