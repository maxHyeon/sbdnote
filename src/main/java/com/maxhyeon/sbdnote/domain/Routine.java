package com.maxhyeon.sbdnote.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Routine {
    private UUID routineId ;
    private String routineName ;
    private List<RoutineExercise> routineExerciseList;

    public Routine(UUID routineId, String routineName){
        this.routineId = routineId;
        this.routineName = routineName;
        this.routineExerciseList = new ArrayList<>(Collections.singletonList(null));
    }
    public void addRoutine(final Exercise exercise){
        routineExerciseList.add(new RoutineExercise(exercise));
    }

}
