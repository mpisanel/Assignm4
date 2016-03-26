package com.demoinheri;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by student on 2016/03/26.
 */
@Configuration
public class AppConf
{
    @Bean(name ="model")
    public Vehicle getVehicle(){
        return new Vehicle();
    }
}
