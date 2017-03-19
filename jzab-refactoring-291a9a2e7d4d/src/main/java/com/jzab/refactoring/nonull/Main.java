package com.jzab.refactoring.nonull;

//import com.jzab.refactoring.nonull.badsmell.Employee;
import com.jzab.refactoring.nonull.refactored.DefaultAddress;
import com.jzab.refactoring.nonull.refactored.Employee;

/**
 *
 * @author jzab
 */
public class Main {

  private static Employee employee;

  public static void main(String[] args){
    initEmployeeInformation();
    printEmployeeInformation();
  }

  private static void initEmployeeInformation(){
    employee = new Employee();
    employee.setHomeAddress(new Address("Av Aviacion", 34, 6));
  }


  private static void printEmployeeInformation(){
    Address homeAddress = employee.getHomeAddress();
    System.out.println("Home Adress: " + homeAddress.toString() );

    Address workAddress = employee.getWorkAddress().orElse(new DefaultAddress());
    System.out.println("Work Adress: " + workAddress.toString() );

    System.out.println("Coodinates: " + workAddress.coordinates() );
  }


}
