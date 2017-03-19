package com.jzab.refactoring.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jzab
 */
class Company {

  private final List<Employee> employees;
  private int employeeCount;

  public Company(){
    this.employees = new ArrayList<>();
  }

  public void hire(Employee e){
    this.employees.add(e);
    employeeCount++;
  }

  public void fire(Employee e){
    this.employees.remove(e);
  }

  public int getEmployeeCount(){
    return employeeCount;
  }

  public List<Employee> getEmployees(){
    return employees;
  }

}
