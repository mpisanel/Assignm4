package com.softprinceples.LSP.violetLSP;

import com.softprinceples.LSP.obeysLSP.Car;

/**
 * Created by student on 2016/03/26.
 */
public class CarTeslaImpl implements Car {

    int gear=0;
    @Override
    public String carName() {
        return "Tesla";
    }

    @Override
    public int gearUp() {
       throw new UnsupportedOperationException() ;
    }
}
