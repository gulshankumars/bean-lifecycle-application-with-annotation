package com.sunglowsys.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.HashMap;
import java.util.Map;

@Component
public class HotelService {

    private Map<String, String> map = null;

    public HotelService(){
        map = new HashMap<>();
    }

    public  void send(String serviceTo){
        System.out.println("Hotel object is created - +serviceTo");
    }

    @PostConstruct
    public void init(){
        map.put("customer", "Gulshan");
        map.put("Room", "205");
        map.put("from", "Raju Hotel");
        System.out.println("Inside init method - "+map);
    }

    @PreDestroy
    public void destroy(){
        map.clear();
        System.out.println("Inside destroy method - "+map);
    }
}
