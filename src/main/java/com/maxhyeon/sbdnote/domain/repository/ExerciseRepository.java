package com.maxhyeon.sbdnote.domain.repository;

import com.maxhyeon.sbdnote.domain.Exercise;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface ExerciseRepository {
    Optional<Exercise> findById(UUID exerciseId);

    void save(Exercise exercise);

    void deleteByExerciseId(UUID exerciseId);

    List<Exercise> findAll();

}
