package com.maxhyeon.sbdnote.domain.repository;

import com.maxhyeon.sbdnote.domain.Routine;

import java.util.List;
import java.util.UUID;

public interface RoutineRepository {
    void save(Routine routine);
    List<Routine> findAll();
    Routine findRoutineById(UUID id);
}
