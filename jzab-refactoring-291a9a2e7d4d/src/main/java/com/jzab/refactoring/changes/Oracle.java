package com.jzab.refactoring.changes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jzab
 */
public class Oracle {

  private OracleRecruiter recruiter;
  private LinkedIn linkedIn;
  private ProductManager manager;

  public Oracle(){
    this.recruiter = new OracleRecruiter();
    this.linkedIn = new LinkedIn();
    this.manager = new ProductManager();
  }

  public void start(){
    new Develop().start();
    new Products().start();
  }

  public class Develop extends Thread {

    @Override
    public void run(){

      int index = 1;
      int counter = 0;

      while (true){

        try {
          Thread.sleep(5000);

          System.out.println("[Oracle] Developing......");

          if (index % 2 == 0){
            System.out.println("[Oracle] New Job opened");
            int min = (int)(Math.random() * 1000) + 10000;
            int max = (int)(Math.random() * 1000) + 20000;

            Job job = new Job("Developer" + index, "Skalia", min, max);
            recruiter.startSearchForEmployee(job);
            linkedIn.postJob(job);
          }

          index++;

          System.out.println();
        }
        catch (InterruptedException ex) {
          Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    }
  }

  public class Products extends Thread {

    @Override
    public void run(){

      int index = 1;

      while (true){

        try {
          Thread.sleep(20000);
          System.out.println("[Oracle] Releasing new Product Oracle " + 1);

          Product p = new Product("Oracle " + 1, index);
          manager.startPromoting(p);

          index++;
          System.out.println();
        }
        catch (InterruptedException ex) {
          Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    }
  }

}
