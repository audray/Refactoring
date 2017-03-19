package com.jzab.refactoring.constructors;

/**
 *
 * @author jzab
 */
public class Main {

  public static void main(String[] args){
    copyPerson();
  }

  private static void copyPerson(){
    Person person = new Person(18, "Juan", "AB", "M", "MX", "Hola");
    Person twin = new Person(person.getAge(), person.getName(), person.getBloodType(),
                             person.getGender(),
                             person.getCountryOfBirth(),
                             person.getGreeting());
    person.salutation();
    twin.salutation();

  }

  private static void copyConstructor(){
    PersonCopyConstructor person = new PersonCopyConstructor(18, "Juan", "AB", "M", "MX", "Programmer");
    PersonCopyConstructor twin = new PersonCopyConstructor(person);
  }

}
