package com.geekster.UniversityEventManagementUsingH2.service;

import com.geekster.UniversityEventManagementUsingH2.model.Event;
import com.geekster.UniversityEventManagementUsingH2.repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    IEventRepo eventRepo;
    public String addEvent(Event event) {
         eventRepo.save(event);
         return "Event Added";
    }

    public List<Event> getAllEvents() {
        return (List<Event>) eventRepo.findAll();
    }

    public String deleteEventById(Integer  eventId) {
        eventRepo.deleteById(eventId);
        return "Event Succesfully removed";
    }

    public String updateEventById(Integer eventId, String eventName) {
        Optional<Event> eventOptional = eventRepo.findById(eventId);
        Event event = null;
        if(eventOptional.isPresent()){
            event = eventOptional.get();
        }else{
            return "event id not found";
        }
        event.setEventName(eventName);
        eventRepo.save(event);
        return "Event Name Updated";
    }

    public List<Event> getAllEventsByDate(String date) {
        return eventRepo.findByDate(date);
    }
}
