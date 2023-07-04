package com.geekster.UniversityEventManagementUsingH2.repository;

import com.geekster.UniversityEventManagementUsingH2.model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface IEventRepo extends CrudRepository<Event,Integer> {

    public  List<Event> findByDate(String date);



}
