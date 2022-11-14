package com.gh.gymhardcore.service;

import com.gh.gymhardcore.dto.TrainingCreateRequest;
import com.gh.gymhardcore.dto.TrainingUpdateRequest;
import com.gh.gymhardcore.entity.MainExercise;
import com.gh.gymhardcore.enums.MainExercises;
import com.gh.gymhardcore.enums.TypeTraining;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class TrainingServiceTest {

    @Mock
    private TrainingService trainingService;

    @Test
    void shouldCreateNewExercise() {
        //given
        final MainExercise mainExercise = new MainExercise();

        mainExercise.setLocalDate(LocalDate.now());
        mainExercise.setTypeTraining(TypeTraining.B);
        mainExercise.setMainExercises(MainExercises.Squat);
        mainExercise.setOneRm(110);

        when(trainingService.createTraining(any(TrainingCreateRequest.class))).thenReturn(mainExercise);

        //when
        MainExercise savedMainExercise = trainingService.createTraining(new TrainingCreateRequest());

        //then
        assertEquals(savedMainExercise.getTypeTraining(), TypeTraining.B);
        assertEquals(savedMainExercise.getLocalDate(), LocalDate.now());
        assertEquals(savedMainExercise.getMainExercises(), MainExercises.Squat);
        assertEquals(savedMainExercise.getOneRm(), 110);

    }

    @Test
    void shouldUpdateExercise() {
        //given
        final MainExercise mainExercise = new MainExercise();

        mainExercise.setLocalDate(LocalDate.now());
        mainExercise.setTypeTraining(TypeTraining.B);
        mainExercise.setMainExercises(MainExercises.Squat);
        mainExercise.setOneRm(110);

        when(trainingService.updateTraining(any(TrainingUpdateRequest.class))).thenReturn(mainExercise);

        //when
        MainExercise savedMainExercise = trainingService.updateTraining(new TrainingUpdateRequest());


        //then
        assertThat(savedMainExercise).isNotNull();

    }
}