package com.softprinceples.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.softprinceples.config.AppConfig;
import com.softprinceples.SRP.violetSRP.Employee;

/**
 * Created by student on 2016/03/26.
 */
public class EmployeeTest {

    private Employee emp;
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)ctx.getBean("emp");

    }

    @Test
    public void testEmp() throws Exception {
        Assert.assertEquals(160,emp.hoursWorked());

    }
}
