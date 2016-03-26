package com.polymorphism;

/**
 * Created by student on 2016/03/26.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf
{
    @Bean(name="sportscar")
    public Vehicle getSpCar(){
        return new SportsCarImpl();
    }
    @Bean(name="suv")
    public Vehicle getSuv(){
        return new SuvImpl();
    }

    @Bean(name="truck")
    public Vehicle getTruck(){
        return new TruckImpl();
    }
}
