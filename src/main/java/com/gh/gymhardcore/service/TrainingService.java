package com.gh.gymhardcore.service;

import com.gh.gymhardcore.dto.TrainingDto;
import com.gh.gymhardcore.entity.Training;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingService {

    private final TrainingRepository trainingRepository;
    private static final double TM = 0.9;


    @Autowired
    public TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }


    public Training createTraining(TrainingDto trainingDto) {
        Training training = new Training();

        training.setTypeTraining(trainingDto.getTypeTraining());
        training.setLocalDate(trainingDto.getLocalDate());
        training.setOneRm(trainingDto.getOneRm());
        training.setMainExercises(trainingDto.getMainExercises());
        training.setTM(countingTM(trainingDto.getOneRm()));
        training.setPercents(trainingDto.getPercents());
        training.setWeight(countingWeights(trainingDto.getPercents(), countingTM(trainingDto.getOneRm())));

        trainingRepository.save(training);

        return training;
    }

    private double countingTM(double oneRm) {

        return Math.round(oneRm * TM);
    }


    //percent counting to check
    private List<Double> countingWeights(List<Integer> percents, double tM) {
        List<Double> weights = new ArrayList<>();

        for (Integer p : percents) {
            double percent = (double) p / 100;
            System.out.println(percent + " * " + tM);
            weights.add((double) Math.round((percent * tM) / 2.5) * 2.5);
        }

        return weights;
    }

}
