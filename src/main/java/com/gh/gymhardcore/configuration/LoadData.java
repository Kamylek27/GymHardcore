package com.gh.gymhardcore.configuration;

import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoadData {
    private final TrainingRepository trainingRepository;
    private boolean switcher = false;

    private static final Logger log = LoggerFactory.getLogger(LoadData.class);
    List<Double> listPress = new ArrayList<>() {{
        add(20.0);
        add(27.5);
        add(32.5);
        add(35.0);
        add(40.0);
        add(45.0);

    }};

    public LoadData(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public void changeSwitcher() {
        if (!switcher) {
            switcher = true;
        } else {
            switcher = false;
        }
        fillDatabase();
    }


    public void fillDatabase() {

        if (switcher) {
            MainExercise press = new MainExercise();

            press.setLocalDate(LocalDate.now());
            press.setTypeTraining(TypeTraining.A);
            press.setMainExercises(MainExercises.Press);
            press.setOneRm(58);
            press.setTM(52.5);
            press.setWeight(listPress);

            trainingRepository.save(press);
        }
    }
}


