package com.jzab.refactoring.example;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

  private String _name;
  private Vector _rentals = new Vector();
  private String result;

  public Customer( String name ) {
    _name = name;
  }

  public void addRental( Rental arg ) {
    _rentals.addElement( arg );
  }

  public String getName() {
    return _name;
  }
  
  public double getAmount(){
	  double totalAmount = 0;
	  double thisAmount;
	  
	  Enumeration rentals = _rentals.elements();
	  
	  while(rentals.hasMoreElements()){
		  Rental each = (Rental) rentals.nextElement();
		  
		  thisAmount = each.getAmount();
	      
	      //show figures for this rental
	      this.result += "\t" + each.getMovie().getTitle() + "\t"
	                + String.valueOf( thisAmount ) + "\n";
	      totalAmount += thisAmount;
	      
	  }
	  
	return totalAmount;
  }

  public int getFrequent(){
	  int frequentRenterPoints = 0;
	  Enumeration rentals = _rentals.elements();
	  
	  while( rentals.hasMoreElements() ) {
	      Rental each = (Rental) rentals.nextElement();

	      frequentRenterPoints += each.getFrequentPoints();

	    }
	  
	return frequentRenterPoints;
  }
  
  public String statement() {
    
    
    this.result = "Rental Record for " + getName() + "\n";
    
    double totalAmount = getAmount();
    int frequentRenterPoints = getFrequent();
    
    
    //add footer lines
    this.result += "Amount owed is " + String.valueOf( totalAmount ) + "\n";
    this.result += "You earned " + String.valueOf( frequentRenterPoints )
              + " frequent renter points";
    return this.result;
  }


}
