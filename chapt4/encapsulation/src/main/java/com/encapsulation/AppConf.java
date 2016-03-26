package com.encapsulation;

/**
 * Created by student on 2016/03/26.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf
{
    @Bean(name="emp")
    public Person getPerson()
    {
        return new EmployeeImpl();
    }
}
