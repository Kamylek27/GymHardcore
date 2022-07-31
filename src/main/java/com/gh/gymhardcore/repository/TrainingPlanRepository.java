package com.gh.gymhardcore.repository;


import com.gh.gymhardcore.entity.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlan, Long> {

}