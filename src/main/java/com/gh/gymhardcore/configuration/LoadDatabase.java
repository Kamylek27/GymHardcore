package com.gh.gymhardcore.configuration;

import com.gh.gymhardcore.entity.Chest;
import com.gh.gymhardcore.repository.ChestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

import static com.gh.gymhardcore.enums.ChestExercise.BENCHPRESS;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ChestRepository chestRepository) {
        return args -> {
            Chest chest = new Chest(1L, BENCHPRESS, 100.0, 5, 10);
            log.info("Preloading " + chestRepository.save(chest));
            List<Chest> chests = chestRepository.findAll();
        };
    }

}
