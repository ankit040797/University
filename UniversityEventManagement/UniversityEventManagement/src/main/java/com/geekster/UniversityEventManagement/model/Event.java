package com.geekster.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @NotBlank(message = "Evnet name is required")
    private String eventName;

    @NotBlank(message = "Location is required")
    private String locationOfEvent;

    @NotNull(message = "Date is required")
    @FutureOrPresent(message = "Date should be in the present or future")
    private Date date;

    @NotNull(message = "Start time is required")
    @Pattern(regexp = "^(?:2[0-3]|[01]?[0-9]):[0-5]?[0-9]$", message = "Start time should be in HH:mm format")
    private String startTime;

    @NotNull(message = "End time is required")
    @Pattern(regexp = "^(?:2[0-3]|[01]?[0-9]):[0-5]?[0-9]$", message = "End time should be in HH:mm format")
    private String endTime;
}
