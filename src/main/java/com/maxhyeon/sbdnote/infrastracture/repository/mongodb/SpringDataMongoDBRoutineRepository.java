package com.maxhyeon.sbdnote.infrastracture.repository.mongodb;

import com.maxhyeon.sbdnote.domain.Routine;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringDataMongoDBRoutineRepository extends MongoRepository<Routine, UUID> {

}
