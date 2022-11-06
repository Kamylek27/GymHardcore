package com.gh.gymhardcore.configuration;

import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import com.gh.gymhardcore.repository.TrainingRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class LoadData {
    private final TrainingRepository trainingRepository;
    private boolean switcher = false;
    private static final Logger log = LoggerFactory.getLogger(LoadData.class);
    final List<Double> listPress = new ArrayList<>() {{
        add(20.0);
        add(27.5);
        add(32.5);
        add(35.0);
        add(40.0);
        add(45.0);

    }};

    final List<Double> listSquat = new ArrayList<>() {{
        add(40.0);
        add(50.0);
        add(60.0);
        add(65.0);
        add(75.0);
        add(85.0);

    }};

    final List<Double> listBenchPress = new ArrayList<>() {{
        add(40.0);
        add(50.0);
        add(60.0);
        add(65.0);
        add(75.0);
        add(85.0);

    }};

    final List<Double> listDeadLift = new ArrayList<>() {{
        add(47.5);
        add(60.0);
        add(70.0);
        add(77.5);
        add(87.5);
        add(100.0);

    }};

    public LoadData(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public boolean changeSwitcher() {
        if (!switcher) {
            fillPressDatabase();
            switcher = true;
        } else {
            log.info("Data already filled");
        }
        return switcher;
    }


    public void fillPressDatabase() {

        MainExercise press = new MainExercise();
        MainExercise squat = new MainExercise();
        MainExercise benchPress = new MainExercise();
        MainExercise deadLift = new MainExercise();

        press.setLocalDate(LocalDate.now());
        press.setTypeTraining(TypeTraining.A);
        press.setMainExercises(MainExercises.Press);
        press.setOneRm(58);
        press.setTM(52.5);
        press.setWeight(listPress);

        squat.setLocalDate(LocalDate.now());
        squat.setTypeTraining(TypeTraining.B);
        squat.setMainExercises(MainExercises.Squat);
        squat.setOneRm(110);
        squat.setTM(100);
        squat.setWeight(listSquat);

        benchPress.setLocalDate(LocalDate.now());
        benchPress.setTypeTraining(TypeTraining.A);
        benchPress.setMainExercises(MainExercises.BenchPress);
        benchPress.setOneRm(110);
        benchPress.setTM(100);
        benchPress.setWeight(listBenchPress);

        deadLift.setLocalDate(LocalDate.now());
        deadLift.setTypeTraining(TypeTraining.B);
        deadLift.setMainExercises(MainExercises.DeadLift);
        deadLift.setOneRm(130);
        deadLift.setTM(117.5);
        deadLift.setWeight(listDeadLift);

        trainingRepository.save(press);
        trainingRepository.save(squat);
        trainingRepository.save(benchPress);
        trainingRepository.save(deadLift);
    }

    public void deleteFillData() {
        trainingRepository.deleteAll();
        switcher = false;
    }
}


