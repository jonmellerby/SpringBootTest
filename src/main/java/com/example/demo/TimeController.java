package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    public final TimeRepository timeRepository;

    public TimeController(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }

    @GetMapping("/times")
    List<Time> getAllTimes() {
        return timeRepository.findAll();
    }

    @PostMapping("/times")
    Time newTime(@RequestBody Time newTime) {
        if (newTime == null) {
            throw new IllegalArgumentException("newTime cannot be null");
        }
        return timeRepository.save(newTime);
    }
}
