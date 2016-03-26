package com.encapsulation;

import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/26.
 */

public class EncapTest extends TestCase
{
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
    Person per = (Person)ctx.getBean("emp");


    public void testName() throws Exception
    {
        per.setName("Luxolo");
        Assert.assertEquals("Luxolo", per.getName());
    }
}
