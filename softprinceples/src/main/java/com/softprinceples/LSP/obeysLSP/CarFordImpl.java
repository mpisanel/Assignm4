package com.softprinceples.LSP.obeysLSP;

/**
 * Created by student on 2016/03/26.
 */
public class CarFordImpl implements Car {

    int gear=0;
    @Override
    public String carName() {
        return "Ford";
    }

    @Override
    public int gearUp() {
        return ++gear ;
    }
}
