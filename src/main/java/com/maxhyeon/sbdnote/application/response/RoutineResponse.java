package com.maxhyeon.sbdnote.application.response;

import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.RoutineExercise;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Builder
public class RoutineResponse {
    private UUID id ;
    private String routineName ;
    private List<RoutineExercise> routineExerciseList;
}
