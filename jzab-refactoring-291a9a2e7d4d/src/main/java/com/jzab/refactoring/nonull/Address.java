package com.jzab.refactoring.nonull;

/**
 *
 * @author jzab
 */
public class Address {

  protected final String street;
  protected int latitude;
  protected int longitude;

  public Address(String street, int latitude, int longitude){
    this.street = street;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public String coordinates(){
    return String.format("Latitude: %d Longitude: %d", latitude, longitude);
  }

  @Override
  public String toString(){
    return street;
  }

}
