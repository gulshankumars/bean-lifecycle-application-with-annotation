package com.sunglowsys;

import com.sunglowsys.applicationconfigure.AppConfig;
import com.sunglowsys.service.HotelService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HotelService hotelService1 = context.getBean(HotelService.class);
        hotelService1.send("Customer Hirdesh");

        HotelService hotelService2 = context.getBean(HotelService.class);
        hotelService2.send("Customer Tejveer");

        context.close();
    }


}
