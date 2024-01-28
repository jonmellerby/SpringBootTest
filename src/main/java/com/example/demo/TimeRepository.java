package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long>{
    public List<Time> findByStartNumber(String startNumber);
    
}
