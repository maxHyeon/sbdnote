package com.maxhyeon.sbdnote.application.response;

import com.maxhyeon.sbdnote.domain.Exercise;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;
import org.mapstruct.Mapper;
import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface ExerciseResponseMapper {

    @Mappings({
            @Mapping(source = "exerciseId", target = "exerciseId"),
            @Mapping(source = "exerciseName", target = "exerciseName")
    })
    List<ExerciseResponse> toListExerciseResponse(List<Exercise> exerciseList) ;
}
