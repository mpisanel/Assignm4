package com.inheritance;

/**
 * Created by student on 2016/03/26.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf
{
    @Bean(name="lul")
    public Gatsby getLargeMac()
    {
        return new CheeseGatImpl();
    }
}
