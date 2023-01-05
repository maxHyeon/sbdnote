package com.maxhyeon.sbdnote.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxhyeon.sbdnote.domain.Exercise;
import com.maxhyeon.sbdnote.domain.RoutineExercise;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddRoutineExerciseRequest {
    @NotNull
    private Exercise exercise;

    @JsonCreator
    public AddRoutineExerciseRequest(@JsonProperty("exercise") @NotNull final Exercise exercise){
        this.exercise = exercise;
    }
}
