package com.geekster.UniversityEventManagement.repo;

import org.springframework.data.repository.CrudRepository;
import com.geekster.UniversityEventManagement.model.Event;

import java.util.Date;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event> findAllByDate(Date date);
}
