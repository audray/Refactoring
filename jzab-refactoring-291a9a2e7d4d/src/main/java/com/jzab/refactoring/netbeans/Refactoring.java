/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jzab.refactoring.netbeans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jzab
 */
public class Refactoring {

  private int rating;
  private Other other;
  //User superType
  private ArrayList<String> list;

  public Refactoring(){
    this.list = new ArrayList<>();
  }

  public void doSomething(){
    if (isRatingFive()){
      System.out.println("Excelente");
      list.add("something");
    }
  }

  public List<String> cloneList(){
    this.list.clone();
    return list;
//    List<String> listCopy = new ArrayList<>();
//    listCopy.addAll(this.list);
//    return listCopy;
  }

  public void addToList(String item){
    list.add(item);
  }

  private boolean isRatingFive(){
    return rating == 5;
  }

  public void thisMethodDontMatch(){
    System.out.println("Not refactored");


    //Annonymus to member
    Thread t = new Thread(){
      @Override
      public void run(){
        super.run(); 
      }
      
    };
  }

  //Outer
  public final class InnerClass {

    private int number;

  }

}
