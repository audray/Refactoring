
package com.jzab.refactoring.nonull.refactored;

import com.jzab.refactoring.nonull.Address;
import java.util.Optional;

/**
 *
 * @author jzab
 */
public class Employee {

  private Address homeAddress;
  private Address workAddress;

  public Employee(){
    this.homeAddress = new DefaultAddress();
    this.workAddress = new DefaultAddress();
  }

  public Address getHomeAddress(){
    return homeAddress;
  }

  public void setHomeAddress(Address homeAddress){
    this.homeAddress = homeAddress;
  }

  public Optional<Address> getWorkAddress(){
    return Optional.ofNullable(workAddress);
  }

  public void setWorkAddress(Address workAddress){
    this.workAddress = workAddress;
  }

  

}
