package com.softprinceples.SRP.obeysSRP;

/**
 * Created by student on 2016/03/26.
 */
public class EmployeeSalImpl implements EmployeeSal {

    @Override
    public int hoursWorked() {
        return 160;
    }

    @Override
    public double salary() {
        return hoursWorked()*120;
    }
}
