
package com.jzab.refactoring.constants;

/**
 *
 * @author zjaramil
 */
public class Constants {

  public static final String EVENT_1 = "Click";
  public static final String EVENT_2 = "DoubleClick";
  public static final String EVENT_3 = "Enter";

  public static void main(String[] args){
    Event e = new Event(EVENT_1);
    processEvent(e);
  }

  private static void processEvent(Event e){
    if( e.getType().equals(EVENT_1)){
      System.out.println("Mouse clicked");
    }
    else if( e.getType().equals(EVENT_2)){
     System.out.println("Double click on mouse");
    }
    else if( e.getType().equals(EVENT_3)){
      System.out.println("Keyboard Enter key");
    }
  }




}
