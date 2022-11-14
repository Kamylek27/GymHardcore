package com.gh.gymhardcore.repository;

import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.enums.MainExercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrainingRepository extends JpaRepository<MainExercise, Long> {
    Optional<MainExercise> findByMainExercises(MainExercises mainExercises);

}
