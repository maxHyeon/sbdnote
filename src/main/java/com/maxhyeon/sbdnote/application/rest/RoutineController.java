package com.maxhyeon.sbdnote.application.rest;

import com.maxhyeon.sbdnote.application.request.AddRoutineExerciseRequest;
import com.maxhyeon.sbdnote.application.request.AddRoutineExerciseSetRequest;
import com.maxhyeon.sbdnote.application.request.CreateRoutineRequest;
import com.maxhyeon.sbdnote.application.response.CreateRoutineResponse;
import com.maxhyeon.sbdnote.application.response.RoutineResponse;
import com.maxhyeon.sbdnote.application.response.RoutineResponseMapper;
import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.service.RoutineService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/routines")
public class RoutineController {
    private final RoutineService routineService;
    private final RoutineResponseMapper routineResponseMapper;

    public RoutineController(RoutineService routineService, RoutineResponseMapper routineResponseMapper) {
        this.routineService = routineService;
        this.routineResponseMapper = routineResponseMapper;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateRoutineResponse createRoutine(@RequestBody final CreateRoutineRequest createRoutineRequest) {
        final UUID routineId = routineService.createRoutine(createRoutineRequest.getRoutine().getRoutineName());
        return new CreateRoutineResponse(routineId);
    }

    @PostMapping(value ="/{routineId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    void addRoutineExercise(@PathVariable final UUID routineId, @RequestBody final AddRoutineExerciseRequest addRoutineExerciseRequest){
        routineService.addRoutineExercise(routineId,addRoutineExerciseRequest.getExercise());
    }

    @PostMapping(value = "/{routineId}/{routineExerciseIndex}",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    void addRoutineExerciseSet(@PathVariable final UUID routineId,
                               @PathVariable final int routineExerciseIndex,
                               @RequestBody final AddRoutineExerciseSetRequest addRoutineExerciseSetRequest){
        routineService.updateRoutineExerciseSets(routineId,
                routineExerciseIndex,
                addRoutineExerciseSetRequest.getSets());
    }

    @GetMapping
    List<RoutineResponse> listRoutine() {
        return routineResponseMapper.toListRoutineResponse(routineService.listRoutine());
    }

    @GetMapping(value = "/{routineId}")
    Routine getRoutine(@PathVariable final UUID routineId) {
        return routineService.getRoutine(routineId);
    }

}
