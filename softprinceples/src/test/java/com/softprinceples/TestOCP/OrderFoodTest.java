package com.softprinceples.TestOCP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.softprinceples.OCP.obeysOCP.OrderFood;
import com.softprinceples.OCP.obeysOCP.OrderFoodImpl2;
import com.softprinceples.config.AppConfig;

/**
 * Created by student on 2016/03/26.
 */
public class OrderFoodTest {

    private OrderFood of;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        of = (OrderFood)ctx.getBean("order");
    }

    @Test
    public void testOrder() throws Exception {
        Assert.assertEquals("Card",((OrderFoodImpl2) of).payCard());

    }
}
