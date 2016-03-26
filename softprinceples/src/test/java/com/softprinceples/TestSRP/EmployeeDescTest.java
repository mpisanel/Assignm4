package com.softprinceples.TestSRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.softprinceples.config.AppConfig;
import com.softprinceples.SRP.obeysSRP.EmployeeDesc;

/**
 * Created by student on 2016/03/26.
 */
public class EmployeeDescTest {

    private EmployeeDesc empDsc;
    private ApplicationContext ctx;
    private String desc = "Name: Luxolo \nSurname: Mpisane \nPosition: CEO";


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        empDsc =(EmployeeDesc)ctx.getBean("empDesc");

    }

    @Test
    public void testEmpDesc() throws Exception {
        Assert.assertSame(desc,empDsc.empDescription());

    }
}
