package com.maxhyeon.sbdnote.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxhyeon.sbdnote.domain.Routine;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class CreateRoutineRequest {
    @NotNull
    private Routine routine;

    @JsonCreator
    public CreateRoutineRequest(@JsonProperty("routine") @NotNull final Routine routine) {
        this.routine = routine;
    }

}
