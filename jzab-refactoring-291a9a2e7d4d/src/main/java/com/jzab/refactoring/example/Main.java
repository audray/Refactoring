package com.jzab.refactoring.example;

/**
 *
 * @author jzab
 */
public class Main {

  public static void main( String[] args ) {
    Customer customer = new Customer( "John" );

    Movie movie = new Movie( "Star Wars", Movie.REGULAR );
    Rental rental = new Rental( movie, 4 );
    consoleReporter cReporter = new consoleReporter();
    htmlReporter htmlR = new htmlReporter();
    customer.addRental( rental );
    
    movie = new Movie( "Pooh", Movie.NEW_RELEASE );
    rental = new Rental( movie, 5 );
    customer.addRental( rental );
    
    String statement = customer.statement();
    
    htmlR.report(statement);

  }

}
