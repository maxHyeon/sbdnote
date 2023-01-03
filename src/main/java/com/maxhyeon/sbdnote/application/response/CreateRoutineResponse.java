package com.maxhyeon.sbdnote.application.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class CreateRoutineResponse {
    private UUID routineId;
}
