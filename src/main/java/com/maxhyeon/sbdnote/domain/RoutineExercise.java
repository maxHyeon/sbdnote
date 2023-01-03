package com.maxhyeon.sbdnote.domain;

import com.maxhyeon.sbdnote.domain.vo.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
public class RoutineExercise {
    private Exercise exercise;
    private List<Set> sets;
    public RoutineExercise(final Exercise exercise){
        this.exercise = exercise;
        this.sets = new ArrayList<>(Collections.singletonList(null));
    }
}
