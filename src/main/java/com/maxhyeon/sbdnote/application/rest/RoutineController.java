package com.maxhyeon.sbdnote.application.rest;

import com.maxhyeon.sbdnote.application.request.CreateExerciseRequest;
import com.maxhyeon.sbdnote.application.request.CreateRoutineRequest;
import com.maxhyeon.sbdnote.application.response.CreateExerciseResponse;
import com.maxhyeon.sbdnote.application.response.CreateRoutineResponse;
import com.maxhyeon.sbdnote.domain.service.RoutineService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.UUID;

@RestController
@RequestMapping("/routine")
public class RoutineController {
    private final RoutineService routineService;

    public RoutineController(RoutineService routineService) {
        this.routineService = routineService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE ,consumes = MediaType.APPLICATION_JSON_VALUE)
    CreateRoutineResponse createRoutine(@RequestBody final CreateRoutineRequest createRoutineRequest) {
        final UUID routineId = routineService.createRoutine(createRoutineRequest.getRoutine().getRoutineName());
        return new CreateRoutineResponse(routineId);
    }

}
