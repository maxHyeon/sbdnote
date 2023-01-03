package com.maxhyeon.sbdnote.infrastracture.configuration;

import com.maxhyeon.sbdnote.infrastracture.repository.mongodb.SpringDataMongoDBExerciseRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoDBExerciseRepository.class)
public class MongoDBConfiguration {
}
