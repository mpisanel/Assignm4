package com.softprinceples.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.softprinceples.LSP.obeysLSP.Car;
import com.softprinceples.LSP.obeysLSP.CarFordImpl;
import com.softprinceples.LSP.violetLSP.CarTeslaImpl;
import com.softprinceples.OCP.obeysOCP.OrderFood;
import com.softprinceples.OCP.obeysOCP.OrderFoodImpl2;
import com.softprinceples.OCP.violetOCP.OrderFoodImpl_v;
import com.softprinceples.OCP.violetOCP.OrderFood_v;
import com.softprinceples.SRP.obeysSRP.EmployeeDesc;
import com.softprinceples.SRP.obeysSRP.EmployeeDescImpl;
import com.softprinceples.SRP.obeysSRP.EmployeeSal;
import com.softprinceples.SRP.obeysSRP.EmployeeSalImpl;
import com.softprinceples.SRP.violetSRP.Employee;
import com.softprinceples.SRP.violetSRP.EmployeeImpl;

/**
 * Created by student on 2016/03/26.
 */
@Configuration
public class AppConfig {
/*********************************************
                    SRP
 *********************************************/

    @Bean(name ="emp")
    public Employee getEmp(){ return new EmployeeImpl();}

    @Bean(name ="empSal")
    public EmployeeSal getEmpSal(){ return new EmployeeSalImpl();}

    @Bean(name ="empDesc")
    public EmployeeDesc getEmpDesc(){ return new EmployeeDescImpl();}
 /*********************************************
                    OCP
 *********************************************/

    @Bean(name ="order_v")
    public OrderFood_v getV_Order(){ return new OrderFoodImpl_v();}
    @Bean(name ="order")
    public OrderFood getOrder(){ return new OrderFoodImpl2(); }
 /*********************************************
                    LSP
 *********************************************/
    @Bean(name="ford")
    public Car getFord(){ return new CarFordImpl();}
    @Bean(name="tesla")
    public Car getTesla(){ return new CarTeslaImpl();}

}
