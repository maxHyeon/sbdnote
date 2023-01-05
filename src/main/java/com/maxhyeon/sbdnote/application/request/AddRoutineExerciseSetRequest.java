package com.maxhyeon.sbdnote.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxhyeon.sbdnote.domain.vo.Rep;
import com.maxhyeon.sbdnote.domain.vo.Weight;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class AddRoutineExerciseSetRequest {
    @NotNull
    private int sequence;
    @NotNull
    private Weight weight;
    @NotNull
    private Rep rep;

    @JsonCreator
    public AddRoutineExerciseSetRequest(@JsonProperty("sequence") final int sequence,
                                        @JsonProperty("weight") final Weight weight,
                                        @JsonProperty("rep") final Rep rep){
        this.sequence = sequence;
        this.weight = weight;
        this.rep = rep;
    }

}
