package com.jzab.refactoring.collection;

/**
 *
 * @author jzab
 */
public class Main {

  public static void main(String[] args){

    Company company = new Company();
    company.hire(new Employee("Pepe"));
    company.hire(new Employee("Toño"));

    for(Employee employee : company.getEmployees()){
      System.out.println(employee);
    }
    System.out.println();

    assert company.getEmployeeCount() == 2;


    //Code from another developer
    company.getEmployees().add(new Employee("Zabdiel"));

    for(Employee employee : company.getEmployees()){
      System.out.println(employee);
    }

    assert company.getEmployeeCount() == 3 : "Someone is not hired correctly";

  }



}
