package com.softprinceples.OCP.obeysOCP;

/**
 * Created by student on 2016/03/26.
 */
public class OrderFoodImpl implements OrderFood {
    @Override
    public String getOrder() {
        return "Fish and chips";
    }

    @Override
    public String pay() {
        return "Cash";
    }
}
