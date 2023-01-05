package com.maxhyeon.sbdnote.application.response;

import com.maxhyeon.sbdnote.domain.Routine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface RoutineResponseMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "routineName", target = "routineName"),
            @Mapping(source = "routineExerciseList", target = "routineExerciseList")
    })
    List<RoutineResponse> toListRoutineResponse(List<Routine> routineList);
}
