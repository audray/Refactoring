package com.jzab.refactoring.versions;

/**
 *
 * @author zjaramil
 */
public class Controller {

  public void doSomething(){
    if (System.getProperty("OS").startsWith("MAC")){
      System.out.println("Mac doSomething");
    }
    else {
      System.out.println("Windows doSomethig");
    }
  }

  public void doAnotherThing(){
    if (System.getProperty("OS").startsWith("MAC")){
      System.out.println("Mac doAnotherThing");
    }
    else {
      System.out.println("Windows doAnotherThing");
    }
  }

  public void doSame(){
    System.out.println("SameTask");
  }

}
