package com.jzab.refactoring.constructors;

/**
 *
 * @author jzab
 */
public class Person {

  private int age;
  private String name;
  private String bloodType;
  private String gender;
  private String countryOfBirth;
  private String greeting;

  public Person(int age, String name, String gender){
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public Person(int age, String name, String bloodType, String gender,
                String countryOfBirth, String greeting){
    this.age = age;
    this.name = name;
    this.bloodType = bloodType;
    this.gender = gender;
    this.countryOfBirth = countryOfBirth;
    this.greeting = greeting;
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

   public String getGreeting(){
    return greeting;
  }

  public void salutation(){
    System.out.printf("%s says: %s%n", name, greeting);
  }

}
