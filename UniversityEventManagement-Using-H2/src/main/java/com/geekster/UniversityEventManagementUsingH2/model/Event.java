package com.geekster.UniversityEventManagementUsingH2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    private Integer eventId;

    private String eventName;

    private String locationOfEvent;

    private String date;




}
