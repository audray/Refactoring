package com.jzab.refactoring.concurrent;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zjaramil
 */
public class GuessGame {

  private int computerNumber;
  private boolean gameActive;

  public void start(){

    gameActive = true;

    Thread thread = new Thread(){
      @Override
      public void run(){
        while(gameActive){
          try {
            computerNumber = (int)(Math.random()*10);
            System.out.printf("Guess my number (Hack:%d) %n", computerNumber);
            Thread.sleep(3000);
          }
          catch (InterruptedException ex) {
            Logger.getLogger(GuessGame.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
      }

    };
    thread.start();

    Scanner scanner = new Scanner(System.in);

    int userNumber = -1;
    do{
      System.out.println("Try:");
      String line = scanner.nextLine();
      userNumber = Integer.parseInt(line);
    }
    while(computerNumber != userNumber);
    gameActive = false;

    System.out.println("You win");

  }


  public static void main(String[] args){
    new GuessGame().start();
  }

}
