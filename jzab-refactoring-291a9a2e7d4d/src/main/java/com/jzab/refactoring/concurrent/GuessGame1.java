package com.jzab.refactoring.concurrent;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author zjaramil
 */
public class GuessGame1 {

  private int score;

  public void start(){

    Task task = new Task();
    Timer t = new Timer();
    t.scheduleAtFixedRate(task, 0, 3000);

    Scanner scanner = new Scanner(System.in);

    int userNumber = -1;
    do{
      System.out.println("Try:");
      String line = scanner.nextLine();
      userNumber = Integer.parseInt(line);
    }
    while(task.computerNumber != userNumber);
    t.cancel();

    System.out.println("You win");

  }


  private class Task extends TimerTask {

    private int computerNumber;

    @Override
    public void run(){
      computerNumber = (int)(Math.random()*10);
      System.out.printf("Guess my number (Hack:%d) %n", computerNumber);
    }

    public int getNumber(){
     return computerNumber;
    }

  }

  public static void main(String[] args){
    new GuessGame1().start();
  }

}
