/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jzab.refactoring.recipe;

/**
 *
 * @author zjaramil
 */
public class Main {

  public static void main(String[] args){
    Task task = new Task();
    task.prepare();
    Object calculation = task.calculate();
    task.compute(calculation);
    task.finish();

    OtherTask oTask = new OtherTask();
    oTask.prepare();
    Object calculation2 = oTask.calculate();
    oTask.process(calculation2);
    oTask.finish();

    AnotherTask aTask = new AnotherTask();
    Object calculation3 = aTask.calculate();
    aTask.doWork(calculation3);
    aTask.finish();

    
    //This bad developer didn't follow the order we want
    OtherTask badTask = new OtherTask();
    Object c = badTask.calculate();
    badTask.prepare();
    badTask.process(c);
    badTask.finish();
  }

}
