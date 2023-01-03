package com.maxhyeon.sbdnote.infrastracture.configuration;

import com.maxhyeon.sbdnote.SbdnoteApplication;
import com.maxhyeon.sbdnote.domain.repository.ExerciseRepository;
import com.maxhyeon.sbdnote.domain.service.DomainExerciseService;
import com.maxhyeon.sbdnote.domain.service.ExerciseService;
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

}
