package com.jzab.refactoring.versions;

/**
 *
 * @author jzab
 */
public class Main {

  public static void main(String[] args){
    System.setProperty("OS", "MAC");
    Controller controller = new Controller();

    controller.doSame();
    controller.doSomething();
    controller.doAnotherThing();

  }

}
