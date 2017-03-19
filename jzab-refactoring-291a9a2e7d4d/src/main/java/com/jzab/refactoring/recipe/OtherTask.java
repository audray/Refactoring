package com.jzab.refactoring.recipe;

/**
 *
 * @author zjaramil
 */
class OtherTask {

  private boolean prepared;

  void prepare(){
    System.out.println("Preparing for task");
    prepared = true;
  }

  Object calculate(){
    if(prepared){
      return "Other";
    }
    else{
      throw new IllegalStateException("Task is not prepared");
    }
  }

  void process(Object calculation){
    System.out.println("Common execution code");
    System.out.printf("Execute %s task %n", calculation);
  }

  void finish(){
    System.out.println("Finish task");
    System.out.println("------------------");
  }



}
