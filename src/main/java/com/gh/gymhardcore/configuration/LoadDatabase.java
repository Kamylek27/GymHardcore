package com.gh.gymhardcore.configuration;

import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.entity.ChestExercise;
import com.gh.gymhardcore.entity.TrainingPlan;
import com.gh.gymhardcore.repository.ChestRepository;
import com.gh.gymhardcore.repository.TrainingPlanRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.gh.gymhardcore.entity.ChestExercise.BenchPress;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TrainingPlanRepository trainingPlanRepository, ChestRepository chestRepository) {
        return args -> {
            Chest chest = new Chest(1L, BenchPress, 100.0, 5, 10, null);
            log.info("Preloading " + chestRepository.save(chest));
            List<Chest> chests = chestRepository.findAll();
            log.info("Preloading " + trainingPlanRepository.save(new TrainingPlan(1L, chests)));
        };
    }

}
