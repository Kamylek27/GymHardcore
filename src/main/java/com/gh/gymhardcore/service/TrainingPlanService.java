package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.TrainingPlan;
import com.gh.gymhardcore.repository.TrainingPlanRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class TrainingPlanService {
    private TrainingPlanRepository trainingPlanRepository;

    public List<TrainingPlan> getAllTrainingPlan() {
        return trainingPlanRepository.findAll();

    }
}
