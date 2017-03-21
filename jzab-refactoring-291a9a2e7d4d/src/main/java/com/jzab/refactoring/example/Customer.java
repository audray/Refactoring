package com.jzab.refactoring.example;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

  private String _name;
  private Vector _rentals = new Vector();
  private String result;
  
  private double amount;
  private int frequentRenterPoints;

  public Customer( String name ) {
    _name = name;
  }

  public void addRental( Rental arg ) {
    _rentals.addElement( arg );
  }

  public String getName() {
    return _name;
  }
  
  
  public void calculate(){
	  
	  this.amount = 0;
	  this.frequentRenterPoints = 0;
	  double thisAmount;
	  
	  Enumeration rentals = _rentals.elements();
	  
	  while( rentals.hasMoreElements() ) {
	      Rental each = (Rental) rentals.nextElement();
	      thisAmount = each.getAmount();
	      
	      //show figures for this rent
	      
	      this.amount += thisAmount;
	      this.frequentRenterPoints += each.getFrequentPoints();

	    }
  }
  
  public String statement(String type) {
	  
	 calculate();
	 
	 this.result = "Rental Record for " + getName() + "\n";
	    Enumeration rentals = _rentals.elements();
		  
		  while( rentals.hasMoreElements() ) {
		      Rental each = (Rental) rentals.nextElement();
		      
		      //show figures for this rental
		      this.result += "\t" + each.getMovie().getTitle() + "\t"
		                + String.valueOf( each.getAmount() ) + "\n";
		    }
	    
	    //add footer lines
	    this.result += "Amount owed is " + String.valueOf( this.amount ) + "\n";
	    this.result += "You earned " + String.valueOf( this.frequentRenterPoints )
	              + " frequent renter points";
	 
	 if(type.equals("HTML")){
		 Writer w = new Writer(getName() +".html", this.result);
		 this.result = "Listo";
	 }
    
    
    return this.result;
  }


}
