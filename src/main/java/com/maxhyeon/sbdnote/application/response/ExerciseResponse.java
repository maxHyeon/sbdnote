package com.maxhyeon.sbdnote.application.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Builder
public class ExerciseResponse {
    private UUID exerciseId;
    private String exerciseName;
}
