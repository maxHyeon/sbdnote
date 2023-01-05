package com.maxhyeon.sbdnote.domain.service;

import com.maxhyeon.sbdnote.domain.Exercise;
import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.RoutineExercise;
import com.maxhyeon.sbdnote.domain.repository.RoutineRepository;
import com.maxhyeon.sbdnote.domain.vo.Set;

import java.util.List;
import java.util.UUID;

public class DomainRoutineService implements RoutineService {

    private final RoutineRepository routineRepository;

    public DomainRoutineService(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    @Override
    public UUID createRoutine(String routineName) {
        final Routine routine = new Routine(UUID.randomUUID(), routineName);
        routineRepository.save(routine);
        return routine.getId();
    }

    @Override
    public void deleteRoutine(UUID id) {

    }

    @Override
    public void updateRoutineName(Routine routine) {

    }

    @Override
    public void addRoutineExercise(UUID id, Exercise exercise) {
        final Routine routine = getRoutine(id);
        final int routineExerciseLastIndex = routine.getInputRoutineExerciseIndex(id);
        routine.addRoutine(routineExerciseLastIndex, exercise);

        routineRepository.save(routine);
    }

    @Override
    public void addRoutineExerciseSet(UUID id, int routineExerciseIndex, Set set) {
        final Routine routine = getRoutine(id);
        routine.addRoutineExerciseSet(routineExerciseIndex, set);
        routineRepository.save(routine);
    }

    @Override
    public void completeRoutine(Routine routine) {

    }

    @Override
    public List<Routine> listRoutine() {
        return routineRepository.findAll();
    }

    @Override
    public Routine getRoutine(UUID id) {
        return routineRepository.findRoutineById(id);
    }

}
