package com.sunglowsys.applicationconfigure;

import com.sunglowsys.service.HotelService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sunglowsys.applicationconfigure")

public class AppConfig {

    @Bean
    public HotelService getHotelService(){
        return new HotelService();
    }
}
