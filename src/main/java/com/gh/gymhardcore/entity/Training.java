package com.gh.gymhardcore.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingId;

    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate localDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "training", fetch = FetchType.LAZY)
    private List<MainExercise> mainExercises;

}
