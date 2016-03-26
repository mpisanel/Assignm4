package com.softprinceples.TestLSP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.softprinceples.LSP.obeysLSP.Car;
import com.softprinceples.config.AppConfig;

/**
 * Created by student on 2016/03/26.
 */
public class FordTest {

    private Car ford;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ford =(Car)ctx.getBean("ford");

    }

    @Test
    public void testFord() throws Exception {

        Assert.assertEquals(1,ford.gearUp());
    }
}
