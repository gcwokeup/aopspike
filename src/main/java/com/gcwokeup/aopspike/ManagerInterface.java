package com.gcwokeup.aopspike;

import java.util.List;

public interface ManagerInterface {

  public EmployeeDTO getEmployeeById(Integer employeeId);

  public List<EmployeeDTO> getAllEmployee();

  public void createEmployee(EmployeeDTO employee);

  public void deleteEmployee(Integer employeeId);

  public void updateEmployee(EmployeeDTO employee);
}
