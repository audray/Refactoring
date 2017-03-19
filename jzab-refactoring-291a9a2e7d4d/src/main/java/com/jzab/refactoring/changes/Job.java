package com.jzab.refactoring.changes;

/**
 *
 * @author jzab
 */
public class Job {

  public String description;
  public String workAddress;
  public int minSalary;
  public int maxSalary;

  public Job(String description, String workAddress, int minSalary, int maxSalary){
    this.description = description;
    this.workAddress = workAddress;
    this.minSalary = minSalary;
    this.maxSalary = maxSalary;
  }



}
