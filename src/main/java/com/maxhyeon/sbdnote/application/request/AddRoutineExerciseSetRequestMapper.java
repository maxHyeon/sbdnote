package com.maxhyeon.sbdnote.application.request;

import com.maxhyeon.sbdnote.application.response.RoutineResponse;
import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.vo.Set;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface AddRoutineExerciseSetRequestMapper {
    @Mappings({
            @Mapping(source = "sequence", target = "sequence"),
            @Mapping(source = "rep", target = "rep"),
            @Mapping(source = "weight", target = "weight")
    })
    Set toSet(AddRoutineExerciseSetRequest addRoutineExerciseSetRequest);
}
