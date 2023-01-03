package com.maxhyeon.sbdnote.application.rest;

import com.maxhyeon.sbdnote.application.request.CreateExerciseRequest;
import com.maxhyeon.sbdnote.application.response.CreateExerciseResponse;
import com.maxhyeon.sbdnote.application.response.ExerciseResponse;
import com.maxhyeon.sbdnote.application.response.ExerciseResponseMapper;

import com.maxhyeon.sbdnote.domain.service.ExerciseService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {
    private final ExerciseService exerciseService;
    private final ExerciseResponseMapper exerciseResponseMapper;

    public ExerciseController( ExerciseService exerciseService, ExerciseResponseMapper exerciseResponseMapper ) {
        this.exerciseService = exerciseService;
        this.exerciseResponseMapper = exerciseResponseMapper;
    }

    @PostMapping( produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    CreateExerciseResponse createExercise(@RequestBody final CreateExerciseRequest createExerciseRequest){
        final UUID exerciseId =  exerciseService.createExercise(createExerciseRequest.getExercise());
        return new CreateExerciseResponse(exerciseId);
    }

    @GetMapping
    List<ExerciseResponse> listExercises(){
        return exerciseResponseMapper.toListExerciseResponse(exerciseService.listExercises());
    }

    @DeleteMapping(value="/{exerciseId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    void deleteExercise(@PathVariable final UUID exerciseId){
        exerciseService.deleteExercise(exerciseId);
    }
}
