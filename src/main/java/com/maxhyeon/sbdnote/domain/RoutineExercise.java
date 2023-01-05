package com.maxhyeon.sbdnote.domain;

import com.maxhyeon.sbdnote.domain.vo.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RoutineExercise {
    private int routineExerciseIndex;
    private Exercise exercise;
    private List<Set> sets;

    public RoutineExercise(final int routineExerciseIndex, final Exercise exercise) {
        this.routineExerciseIndex = routineExerciseIndex;
        this.exercise = exercise;
        this.sets = new ArrayList<>();
    }
    void setSets(List<Set> sets){
        this.sets = sets;
    }
}
