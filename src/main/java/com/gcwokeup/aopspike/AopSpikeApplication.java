package com.gcwokeup.aopspike;

import com.gcwokeup.aopspike.Components.EmployeeManager;
import com.gcwokeup.aopspike.DTOs.EmployeeDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AopSpikeApplication {

  @SuppressWarnings("resource")
  public static void main(String[] args) {

    EmployeeManager manager = new EmployeeManager();

    manager.getEmployeeById(1);
    manager.createEmployee(new EmployeeDTO());
  }

}
