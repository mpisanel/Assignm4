package com.inheritance;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/26.
 */

public class InheriTest extends TestCase
{
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
    Gatsby myGatsby = (Gatsby)ctx.getBean("lul");
    List oder;


    public void testName() throws Exception
    {
        oder = new ArrayList();
        myGatsby.addCheese();
        myGatsby.addOnions();
        myGatsby.addPattie();
        myGatsby.addSauce("LargeMac Sc");

        Assert.assertEquals("[Cheese, Onions, Pattie, LargeMac Sc]", myGatsby.serve());
    }

}
