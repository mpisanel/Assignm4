package com.polymorphism;

/**
 * Created by student on 2016/03/26.
 */
public class TruckImpl implements Vehicle{
    @Override
    public void StartEngine() {
        System.out.println("Engine Start");
    }

    @Override
    public String move() {
        return "six wheel drive";
    }
}
