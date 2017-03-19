package com.jzab.refactoring.recipe;

/**
 *
 * @author zjaramil
 */
class AnotherTask {

  Object calculate(){
    return "Another";
  }

  void doWork(Object calculation){
    System.out.println("Common execution code");
    System.out.printf("Execute %s task %n", calculation);
  }

  void finish(){
    System.out.println("Finish task");
    System.out.println("------------------");
  }



}
