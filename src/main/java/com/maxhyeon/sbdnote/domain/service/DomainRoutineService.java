package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.repository.RoutineRepository;

import java.util.List;
import java.util.UUID;

public class DomainRoutineService implements RoutineService{

    private final RoutineRepository routineRepository;
    public DomainRoutineService(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    @Override
    public UUID createRoutine(String routineName) {
        final Routine routine = new Routine( UUID.randomUUID(), routineName);
        routineRepository.save(routine);
        return routine.getRoutineId();
    }

    @Override
    public void deleteRoutine(UUID routineId) {

    }

    @Override
    public void updateRoutineName(Routine routine) {

    }

    @Override
    public void addExercise(UUID exerciseId, Routine routine) {

    }

    @Override
    public void completeRoutine(Routine routine) {

    }

    @Override
    public List<Routine> listRoutine() {
        return null;
    }

    @Override
    public Routine getRoutine(UUID routineId) {
        return null;
    }
}
