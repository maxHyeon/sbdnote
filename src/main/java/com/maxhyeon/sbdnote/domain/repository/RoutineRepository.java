package com.maxhyeon.sbdnote.domain.repository;

import com.maxhyeon.sbdnote.domain.Routine;

import java.util.List;

public interface RoutineRepository {
    void save(Routine routine);
    List<Routine> findAll();

}
