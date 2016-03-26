package com.softprinceples.SRP.violetSRP;

/**
 * Created by student on 2016/03/26.
 */
public class EmployeeImpl implements Employee {
    @Override
    public int hoursWorked() {
        return 160;
    }

    @Override
    public double salary() {
        return hoursWorked()*120;
    }

    @Override
    public String empDescription() {
        return "Name: Luxolo \nSurname: Mpisane \nPosition: CEO";
    }
}
