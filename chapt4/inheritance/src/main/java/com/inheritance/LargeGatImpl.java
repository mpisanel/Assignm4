package com.inheritance;

import java.util.List;

/**
 * Created by student on 2016/03/26.
 */
public class LargeGatImpl extends CheeseGatImpl
{
    public LargeGatImpl(List myGatsby)
    {
        super(myGatsby);
    }

    public LargeGatImpl() {
        super();
    }

    public void addSauce()
    {
        super.addSauce("Large Mac sauce");
    }

}
