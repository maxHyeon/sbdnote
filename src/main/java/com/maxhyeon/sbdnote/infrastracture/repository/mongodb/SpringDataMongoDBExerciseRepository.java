package com.maxhyeon.sbdnote.infrastracture.repository.mongodb;

import com.maxhyeon.sbdnote.domain.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoDBExerciseRepository extends MongoRepository<Exercise, UUID>{
    void deleteByExerciseId(UUID exerciseId);
}
