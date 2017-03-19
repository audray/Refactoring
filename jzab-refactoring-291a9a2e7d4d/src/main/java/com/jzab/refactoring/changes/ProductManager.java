package com.jzab.refactoring.changes;

/**
 *
 * @author jzab
 */
public class ProductManager {

  public void startPromoting(Product p){
    System.out.println("[Manager] Promoting:"  +p.name + " version:" + p.version);
  }

}
