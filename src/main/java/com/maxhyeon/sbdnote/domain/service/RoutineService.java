package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.RoutineExercise;

import java.util.List;
import java.util.UUID;

public interface RoutineService {
    UUID createRoutine (final String routineName);
    void deleteRoutine (final UUID routineId);
    void updateRoutineName (final Routine routine);
    void addExercise (final UUID exerciseId, final Routine routine);
    void completeRoutine (final Routine routine);

    List<Routine> listRoutine() ;

    Routine getRoutine(final UUID routineId);
}
