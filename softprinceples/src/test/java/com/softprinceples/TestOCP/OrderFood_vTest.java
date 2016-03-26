package com.softprinceples.TestOCP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.softprinceples.OCP.violetOCP.OrderFood_v;
import com.softprinceples.config.AppConfig;

/**
 * Created by student on 2016/03/26.
 */
public class OrderFood_vTest {


    private OrderFood_v ofv;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ofv = (OrderFood_v)ctx.getBean("order_v");

    }

    @Test
    public void testOrder() throws Exception {
       Assert.assertEquals("Cash", ofv.payOption(1));
    }
}
