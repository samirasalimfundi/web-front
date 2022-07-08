package com.example.costomers.controller;

import com.example.costomers.model.Time;
import com.example.costomers.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
@RestController
public class timeController {
    @Autowired
    private TimeService timeServices;

    //save data inff
    @PostMapping("/savetime")
    public String savetime(@RequestBody Time time){
        timeServices.saveTime(time);
        return "You havebeen success registered";
    }
    //save many data
    @PostMapping("/listtime")
    public String Listtime (@RequestBody List<Time> timeList){
        timeServices.saveList(timeList);
        return "timeList";

    }
    @GetMapping("/viewtime")
    public List<Time> viewall(){
        return timeServices.gettime();
    }


}
