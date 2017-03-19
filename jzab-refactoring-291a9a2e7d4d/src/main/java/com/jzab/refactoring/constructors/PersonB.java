package com.jzab.refactoring.constructors;

/**
 *
 * @author jzab
 */
public class PersonB {

  private int age;
  private String name;
  private String bloodType;
  private String gender;
  private String countryOfBirth;

  public PersonB(int age, String name, String bloodType, String gender, String countryOfBirth){
    this.age = age;
    this.name = name;
    this.bloodType = bloodType;
    this.gender = gender;
    this.countryOfBirth = countryOfBirth;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getBloodType(){
    return bloodType;
  }

  public void setBloodType(String bloodType){
    this.bloodType = bloodType;
  }

  public String getGender(){
    return gender;
  }

  public void setGender(String gender){
    this.gender = gender;
  }

  public String getCountryOfBirth(){
    return countryOfBirth;
  }

  public void setCountryOfBirth(String countryOfBirth){
    this.countryOfBirth = countryOfBirth;
  }

}
