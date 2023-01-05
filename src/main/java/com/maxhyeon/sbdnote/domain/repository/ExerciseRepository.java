package com.maxhyeon.sbdnote.domain.repository;

import com.maxhyeon.sbdnote.domain.Exercise;

import java.util.List;

import java.util.Optional;
import java.util.UUID;

public interface ExerciseRepository {
    Optional<Exercise> findById(UUID id);

    void save(Exercise exercise);

    void deleteById(UUID id);

    List<Exercise> findAll();

}
