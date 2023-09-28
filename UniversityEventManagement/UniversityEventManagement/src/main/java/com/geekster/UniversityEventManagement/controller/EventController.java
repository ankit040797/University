package com.geekster.UniversityEventManagement.controller;

import com.geekster.UniversityEventManagement.model.Event;
import com.geekster.UniversityEventManagement.service.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("addEvent")
    public Event addEvent(@Valid @RequestBody Event event) {
       return eventService.addEvent(event);
    }

    @PostMapping("addEvents")
    public String addEvents(@RequestBody List<Event> newEvents){
        return eventService.addEvents(newEvents);
    }

    @GetMapping("by-date")
    public List<Event> getAllEventsByDate(@RequestParam Date date) {
        return eventService.getAllEventsByDate(date);
    }

    @GetMapping("event/{eventId}")
    public Optional<Event> getEventById(@PathVariable Long eventId) {
        return eventService.getEventById(eventId);
    }

    @PutMapping("update")
    public Event updateEvent(@Valid @RequestBody Event event) {
        return eventService.updateEvent(event);
    }

    @DeleteMapping("event/{eventId}/delete")
    public void deleteEvent(@PathVariable Long eventId) {
        eventService.deleteEvent(eventId);
    }

}
