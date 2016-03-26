package com.demoinheri;

import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2016/03/26.
 */
public class VehicleTest extends TestCase
{
    private ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
    private Vehicle veh;


    public void testVehicle() throws Exception {
        veh = new Vehicle();
        veh.setVehicle("BMW", "X6", 2011,"SUV");
        Assert.assertSame("SUV", veh.getV_type());
    }

}
