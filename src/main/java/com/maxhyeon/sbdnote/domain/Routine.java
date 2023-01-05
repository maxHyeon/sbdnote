package com.maxhyeon.sbdnote.domain;

import com.maxhyeon.sbdnote.domain.vo.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Routine {
    private UUID id;
    private String routineName;
    private List<RoutineExercise> routineExerciseList;

    public Routine(UUID id, String routineName) {
        this.id = id;
        this.routineName = routineName;
        this.routineExerciseList = new ArrayList<>();
    }

    public RoutineExercise getRoutineExercise(final int routineExerciseIndex) {
        return routineExerciseList
                .stream()
                .filter(routineExercise -> routineExercise.getRoutineExerciseIndex() == routineExerciseIndex)
                .findFirst()
                .orElseThrow(() -> new DomainException("RoutineExercise index " + routineExerciseIndex + " doesn't exist."));
    }

    public int getInputRoutineExerciseIndex(final UUID id) {
        if (routineExerciseList.isEmpty()) {
            return 0;
        }
        return routineExerciseList.size();
    }

    public void addRoutine(final int routineExerciseIndex, final Exercise exercise) {
        routineExerciseList.add(new RoutineExercise(routineExerciseIndex, exercise));
    }

    public void updateRoutineExerciseSet(final int routineExerciseIndex, final List<Set> sets) {
        getRoutineExercise(routineExerciseIndex)
                .setSets(sets);
    }

    public void addRoutineExerciseSet(final int routineExerciseIndex, Set set) {
        getRoutineExercise(routineExerciseIndex)
                .getSets()
                .add(set);
    }

    public void deleteRoutineExerciseLastSet(final int routineExerciseIndex) {
        RoutineExercise routineExercise = getRoutineExercise(routineExerciseIndex);
        List<Set> sets = routineExercise.getSets();
        if (sets.isEmpty() || sets == null) {
            new DomainException(routineExercise.getExercise().getExerciseName() + "'s set is not exist");
        }
        sets.remove(sets.size() - 1);
    }

    public int getRoutineExerciseSetLastIndex(final int routineExerciseIndex) {
        List<Set> sets = getRoutineExercise(routineExerciseIndex).getSets();
        if (sets.isEmpty() || sets == null) { return 0; }
        return sets.size() -1 ;
    }

}
