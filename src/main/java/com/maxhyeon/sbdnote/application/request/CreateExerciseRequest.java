package com.maxhyeon.sbdnote.application.request;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxhyeon.sbdnote.domain.Exercise;
import jakarta.validation.constraints.NotNull;

public class CreateExerciseRequest {
    @NotNull private Exercise exercise;

    @JsonCreator
    public CreateExerciseRequest(@JsonProperty("exercise") @NotNull final Exercise exercise) {
        this.exercise = exercise;
    }

    public Exercise getExercise(){
        return exercise;
    }

}
