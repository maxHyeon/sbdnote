package com.maxhyeon.sbdnote.infrastracture.repository.mongodb;

import com.maxhyeon.sbdnote.domain.Routine;
import com.maxhyeon.sbdnote.domain.repository.RoutineRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@Primary
public class MongoDBRoutineRepository implements RoutineRepository {

    private final SpringDataMongoDBRoutineRepository routineRepository;

    public MongoDBRoutineRepository(SpringDataMongoDBRoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    @Override
    public void save(Routine routine) {
        routineRepository.save(routine);
    }

    @Override
    public List<Routine> findAll() {
        return routineRepository.findAll();
    }

    @Override
    public Routine findRoutineById(UUID id) {
        return routineRepository.findRoutineById(id);
    }

}
