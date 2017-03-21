package com.jzab.refactoring.example;

/**
 *
 * @author jzab
 */
class Rental {

  private Movie movie;
  private int daysRented;

  public Rental(Movie movie, int daysRented ) {
    this.movie = movie;
    this.daysRented = daysRented;
  }

  public int getDaysRented() {
    return this.daysRented;
  }

  public Movie getMovie() {
    return this.movie;
  }
  
  public double getAmount(){
	  double thisAmount = 0;
	  
	  switch (movie.getPriceCode()){
	  case Movie.REGULAR:
          thisAmount += 2;
          if( getDaysRented() > 2 ) {
            thisAmount += ( getDaysRented() - 2 ) * 1.5;
          }
          break;
        case Movie.NEW_RELEASE:
          thisAmount += getDaysRented() * 3;
          break;
        case Movie.CHILDRENS:
          thisAmount += 1.5;
          if( getDaysRented() > 3 ) {
            thisAmount += ( getDaysRented() - 3 ) * 1.5;
          }
          break;
	  }
	  
	  return thisAmount;
  }
  
  public int getFrequentPoints(){
	  int frequentRenterPoints = 1;
	  
	  if( ( movie.getPriceCode() == Movie.NEW_RELEASE )
	          && daysRented > 1 ) {
	        frequentRenterPoints++;
	      }
	  
	  return frequentRenterPoints;
  }
}
