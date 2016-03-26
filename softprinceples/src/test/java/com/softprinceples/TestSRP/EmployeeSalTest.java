package com.softprinceples.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.softprinceples.config.AppConfig;
import com.softprinceples.SRP.obeysSRP.EmployeeSal;

/**
 * Created by student on 2016/03/26.
 */
public class EmployeeSalTest {

    private EmployeeSal empSal;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empSal =(EmployeeSal)ctx.getBean("empSal");

    }

    @Test
    public void testEmplSal() throws Exception {

        Assert.assertEquals(19200.0,empSal.salary(),empSal.salary());

    }
}
