package com.maxhyeon.sbdnote.infrastracture.repository.mongodb;

import com.maxhyeon.sbdnote.domain.Exercise;
import com.maxhyeon.sbdnote.domain.repository.ExerciseRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
@Primary
public class MongoDBExerciseRepository implements ExerciseRepository {

    private final SpringDataMongoDBExerciseRepository exerciseRepository;

    public MongoDBExerciseRepository(SpringDataMongoDBExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public Optional<Exercise> findById(final UUID exerciseId) {
        return exerciseRepository.findById(exerciseId);
    }

    @Override
    public void save(Exercise exercise) {
        exerciseRepository.save(exercise);
    }

    @Override
    public void deleteById(final UUID id) {
        exerciseRepository.deleteById(id);
    }

    @Override
    public List<Exercise> findAll() {;
        return exerciseRepository.findAll();
    }
}
