package com.maxhyeon.sbdnote.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.maxhyeon.sbdnote.domain.vo.Set;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.List;

@Getter
public class AddRoutineExerciseSetListRequest {
    @NotNull
    private List<Set> sets;

    @JsonCreator
    public AddRoutineExerciseSetListRequest(@JsonProperty("sets")  @JsonInclude(JsonInclude.Include.NON_NULL) @NotNull final List<Set> sets){
        this.sets = sets;
    }

}
