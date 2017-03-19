package com.jzab.refactoring.nonull.refactored;

import com.jzab.refactoring.nonull.Address;

/**
 *
 * @author jzab
 */
public class DefaultAddress extends Address {

  public DefaultAddress(){
    super("No Address", 0, 0);
  }

  @Override
  public String coordinates(){
    return "No coordinates";
  }







}
