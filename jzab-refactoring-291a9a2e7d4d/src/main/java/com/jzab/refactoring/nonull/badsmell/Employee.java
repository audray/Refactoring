
package com.jzab.refactoring.nonull.badsmell;

import com.jzab.refactoring.nonull.Address;

/**
 *
 * @author jzab
 */
public class Employee {

  private Address homeAddress;
  private Address workAddress;

  public Address getHomeAddress(){
    return homeAddress;
  }

  public void setHomeAddress(Address homeAddress){
    this.homeAddress = homeAddress;
  }

  public Address getWorkAddress(){
    return workAddress;
  }

  public void setWorkAddress(Address workAddress){
    this.workAddress = workAddress;
  }

  

}
