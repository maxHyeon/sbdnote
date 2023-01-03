package com.maxhyeon.sbdnote.infrastracture.configuration;

import com.maxhyeon.sbdnote.SbdnoteApplication;
import com.maxhyeon.sbdnote.domain.repository.ExerciseRepository;
import com.maxhyeon.sbdnote.domain.repository.RoutineRepository;
import com.maxhyeon.sbdnote.domain.service.DomainExerciseService;
import com.maxhyeon.sbdnote.domain.service.DomainRoutineService;
import com.maxhyeon.sbdnote.domain.service.ExerciseService;
import com.maxhyeon.sbdnote.domain.service.RoutineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SbdnoteApplication.class)
public class BeanConfiguration {
    @Bean
    ExerciseService exerciseService(final ExerciseRepository exerciseRepository){
        return new DomainExerciseService(exerciseRepository);
    }

    @Bean
    RoutineService routineService(final RoutineRepository routineRepository){
        return new DomainRoutineService(routineRepository);
    }

}
