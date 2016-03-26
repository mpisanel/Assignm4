package com.softprinceples.TestLSP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.softprinceples.LSP.obeysLSP.Car;
import com.softprinceples.config.AppConfig;

/**
 * Created by student on 2016/03/26.
 */
public class TeslaTest {

    private Car tesla;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tesla = (Car)ctx.getBean("tesla");
    }

    @Test
    @Ignore
    public void testTesla() throws Exception {
        Assert.assertNotEquals(1,tesla.gearUp());
    }
}

