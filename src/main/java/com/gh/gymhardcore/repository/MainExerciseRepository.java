package com.gh.gymhardcore.repository;

import com.gh.gymhardcore.entity.MainExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainExerciseRepository extends JpaRepository<MainExercise, Long> {
}
