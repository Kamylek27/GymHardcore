package com.gh.gymhardcore.service;

import com.gh.gymhardcore.entity.TrainingPlan;
import com.gh.gymhardcore.repository.TrainingPlanRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingPlanService {
    private final TrainingPlanRepository trainingPlanRepository;

    public List<TrainingPlan> getAllTrainingPlan() {
        return trainingPlanRepository.findAll();

    }
}
