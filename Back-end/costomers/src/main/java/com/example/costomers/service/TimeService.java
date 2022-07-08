package com.example.costomers.service;

import com.example.costomers.model.Time;
import com.example.costomers.model.Time;
import com.example.costomers.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {
    @Autowired
    private TimeRepository timeRepository;


    public List<Time> gettime() {
       return timeRepository.findAll();
    }

    public void saveTime(Time time) {
        timeRepository.save(time);
    }

    public void saveList(List<Time> timeList) {
        timeRepository.saveAll(timeList);
    }
}
