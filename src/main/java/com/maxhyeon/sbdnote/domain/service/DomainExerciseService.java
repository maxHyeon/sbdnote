package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Exercise;
import com.maxhyeon.sbdnote.domain.repository.ExerciseRepository;

import java.util.List;
import java.util.UUID;

public class DomainExerciseService implements ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public DomainExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public UUID createExercise(String exerciseName) {
        final Exercise exercise = new Exercise(UUID.randomUUID(), exerciseName);
        exerciseRepository.save(exercise);
        return exercise.getId();
    }

    @Override
    public void editExercise(UUID id) {
        ;
    }

    @Override
    public void deleteExercise(UUID id) {
        exerciseRepository.deleteById(id);
    }

    @Override
    public List<Exercise> listExercises() {
        return exerciseRepository.findAll();
    }
}
