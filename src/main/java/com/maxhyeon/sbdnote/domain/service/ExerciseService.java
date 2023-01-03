package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Exercise;

import java.util.List;
import java.util.UUID;

public interface ExerciseService {
    UUID createExercise(Exercise exercise);
    void editExercise(UUID exerciseId);
    void deleteExercise(UUID id);
    List<Exercise> listExercises();
}
