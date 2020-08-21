package com.fengfan.k12.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TimeController {

    @RequestMapping(value = "/time")
    public Map<String,String> getTime(){
        String time = Long.toString(System.currentTimeMillis()/1000L);
        Map<String,String> mp=new HashMap<>();
        mp.put("time",time);
        return mp;
    }
}
