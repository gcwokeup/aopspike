package com.gcwokeup.aopspike;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager implements ManagerInterface {

  @CustomAnnotation
  public EmployeeDTO getEmployeeById(Integer employeeId) {
    System.out.println("Method getEmployeeById() called");
    return new EmployeeDTO();
  }

  @CustomAnnotation
  public List<EmployeeDTO> getAllEmployee() {
    System.out.println("Method getAllEmployee() called");
    return new ArrayList<EmployeeDTO>();
  }

  @CustomAnnotation
  public void createEmployee(EmployeeDTO employee) {
    System.out.println("Method createEmployee() called");
  }

  @CustomAnnotation
  public void deleteEmployee(Integer employeeId) {
    System.out.println("Method deleteEmployee() called");
  }

  @CustomAnnotation
  public void updateEmployee(EmployeeDTO employee) {
    System.out.println("Method updateEmployee() called");
  }
}
