package com.polymorphism;

/**
 * Created by student on 2016/03/26.
 */
public class SuvImpl implements Vehicle
{
    @Override
    public void StartEngine() {
        System.out.println("Engine started");
    }

    @Override
    public String move() {
        return "Four wheel drive";
    }

}
