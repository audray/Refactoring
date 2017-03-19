package com.jzab.refactoring.recipe;

/**
 *
 * @author zjaramil
 */
public class Task {

  void prepare(){
    System.out.println("Preparing for task");
  }

  Object calculate(){
    return "Task";
  }

  void compute(Object calculation){
    System.out.println("Common execution code");
    System.out.printf("Execute %s task %n", calculation);
  }

  void finish(){
    System.out.println("Finish task");
    System.out.println("------------------");
  }

  

}
