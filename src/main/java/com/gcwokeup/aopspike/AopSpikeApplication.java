package com.gcwokeup.aopspike;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopSpikeApplication {


  public static void main(String[] args) {
    SpringApplication.run(AopSpikeApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      ManagerInterface manager = ctx.getBean(ManagerInterface.class);

      manager.getEmployeeById(1);
      manager.createEmployee(new EmployeeDTO());

    };
  }

}
