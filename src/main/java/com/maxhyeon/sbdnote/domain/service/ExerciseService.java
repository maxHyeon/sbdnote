package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Exercise;

import java.util.List;
import java.util.UUID;

public interface ExerciseService {
    UUID createExercise(String exerciseName);
    void editExercise(UUID id);
    void deleteExercise(UUID id);
    List<Exercise> listExercises();
}
