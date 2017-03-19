package com.jzab.refactoring.constructors;

/**
 *
 * @author jzab
 */
public class PersonCopyConstructor {

  private int age;
  private String name;
  private String bloodType;
  private String gender;
  private String countryOfBirth;

  public PersonCopyConstructor(int age, String name, String bloodType, String gender, String countryOfBirth,
                                                                                      String jobTitle){
    this.age = age;
    this.name = name;
    this.bloodType = bloodType;
    this.gender = gender;
    this.countryOfBirth = countryOfBirth;
  }

  public PersonCopyConstructor(PersonCopyConstructor person){
    this.age = person.getAge();
    this.name = person.getName();
    this.bloodType = person.getBloodType();
    this.gender = person.getGender();
    this.countryOfBirth = person.getCountryOfBirth();
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
