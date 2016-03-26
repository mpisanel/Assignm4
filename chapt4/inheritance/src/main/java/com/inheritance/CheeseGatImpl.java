package com.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2016/03/26.
 */
public class CheeseGatImpl implements Gatsby{
    private List myGatsby = new ArrayList();

    public CheeseGatImpl(List myGatsby) {
        this.myGatsby = myGatsby;
    }

    public CheeseGatImpl() {

    }

    @Override
    public void addCheese() {
        myGatsby.add("Cheese");
    }

    @Override
    public void addPattie() {
        myGatsby.add("Pattie");
    }

    @Override
    public void addOnions() {
        myGatsby.add("Onions");
    }

    @Override
    public void addSauce(String sauce) {
        myGatsby.add(sauce);
    }


    @Override
    public String serve() {
        return myGatsby.toString();
    }
}
