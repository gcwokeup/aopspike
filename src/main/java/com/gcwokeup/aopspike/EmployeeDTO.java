package com.gcwokeup.aopspike;

public class EmployeeDTO {

  public Integer id;
  public String firstName;
  public String lastName;

  @CustomAnnotation
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @CustomAnnotation
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @CustomAnnotation
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}