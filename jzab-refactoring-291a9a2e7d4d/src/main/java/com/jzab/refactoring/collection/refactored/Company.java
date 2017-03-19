package com.jzab.refactoring.collection.refactored;

import com.jzab.refactoring.collection.Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jzab
 */
public class Company {

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
    return Collections.unmodifiableList(employees);
  }

}
