package com.demoinheri;

/**
 * Created by student on 2016/03/26.
 */
public class Vehicle
{

    CarImpl car ;

    private String v_maker;
    private String v_model;
    private int v_year;

    public Vehicle() {
        car = new CarImpl();
    }

    public void setVehicle(String v_maker, String v_model, int v_year, String v_type) {
        car = new CarImpl();
        this.v_maker = v_maker;
        this.v_model = v_model;
        this.v_year = v_year;
        car.setV_type(v_type);
    }
    public String getV_type(){ return car.getV_type(); }



    public void setV_maker(String v_maker) {
        this.v_maker = v_maker;
    }

    public void setV_year(int v_year) {
        this.v_year = v_year;
    }

    public void setV_model(String v_model) {
        this.v_model = v_model;
    }
    public String getV_model() {
        return v_model;
    }

    public int getV_year() {
        return v_year;
    }

    public String getV_maker() {
        return v_maker;
    }
}
