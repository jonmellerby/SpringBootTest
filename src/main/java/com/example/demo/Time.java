package com.example.demo;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Time {
    @Id @GeneratedValue private long ID;
    private String startNumber;
    private LocalTime time;

    public Time() {

    }
    public Time(String startNumber, LocalTime time) {
        this.startNumber = startNumber;
        this.time = time;
    }

    public String getStartNumber() {
        return startNumber;
    }

    public LocalTime getTime() {
        return time;
    }


    @Override
    public String toString() {
        return String.format("Rider startNumber: %s, ID: %s, Time: %s", startNumber, ID, time.toString());
    }
}
