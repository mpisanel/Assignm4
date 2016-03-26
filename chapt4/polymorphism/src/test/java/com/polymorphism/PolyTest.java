package com.polymorphism;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/26.
 */
public class PolyTest extends TestCase
{
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
    Vehicle ferrari = (Vehicle)ctx.getBean("sportscar");
    Vehicle fortuner = (Vehicle)ctx.getBean("suv");
    Vehicle  dav = (Vehicle)ctx.getBean("truck");

    public void testName() throws Exception {
        Assert.assertEquals("Super Charge", ferrari.move());
        Assert.assertEquals("Four wheel drive", fortuner.move());
        Assert.assertEquals("six wheel drive", dav.move());

    }
}
