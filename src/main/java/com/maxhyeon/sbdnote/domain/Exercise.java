package com.maxhyeon.sbdnote.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class Exercise {
    private UUID exerciseId;
    private String exerciseName;

    public void validateExercise(final Exercise exercise) {
        if (exercise == null) {
            throw new DomainException("The exercise cannot be null.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Exercise exercise = (Exercise) o;
        return Objects.equals(exerciseId, exercise.exerciseId) && Objects.equals(exerciseName, exercise.exerciseName);
    }

}
