package com.jzab.refactoring.collection.refactored;

import com.jzab.refactoring.collection.Employee;

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


    //Another developer
    company.getEmployees().add(new Employee("Zabdiel"));

    for(Employee employee : company.getEmployees()){
      System.out.println(employee);
    }

  }

}
