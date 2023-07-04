package com.geekster.UniversityEventManagementUsingH2.controller;

import com.geekster.UniversityEventManagementUsingH2.model.Event;
import com.geekster.UniversityEventManagementUsingH2.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("event")
        public String addEvent(@RequestBody Event event){
            return eventService.addEvent(event);


        }
    @GetMapping("get/events")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();


    }
    @DeleteMapping("deleteEvent/{eventId}")
    public String deleteEventById(@PathVariable Integer eventId){
        return eventService.deleteEventById(eventId);

    }
    @PutMapping("event/{eventId}/{eventName}")
    public String  updateEventById(@PathVariable Integer eventId , @PathVariable String eventName){
        return eventService.updateEventById(eventId , eventName);

    }
    //Get events by Date
    @GetMapping("events/{date}")
    public List<Event> getAllEventsByDate(@PathVariable String date){
        return eventService.getAllEventsByDate(date);
    }



    }


