package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Exercise;
import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.RoutineExercise;
import com.maxhyeon.sbdnote.domain.vo.Set;

import java.util.List;
import java.util.UUID;

public interface RoutineService {
    UUID createRoutine (final String routineName);
    void deleteRoutine (final UUID id);
    void updateRoutineName (final Routine routine);
    void addRoutineExercise (final UUID id, final Exercise exercise);
    void updateRoutineExerciseSets(final UUID id, final int routineExerciseIndex, final List<Set> sets);
    void completeRoutine (final Routine routine);

    List<Routine> listRoutine() ;

    Routine getRoutine(final UUID id);

}
