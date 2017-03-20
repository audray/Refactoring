/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jzab.refactoring.example;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ari
 */
public class Refactoring_Test {
    
   private Customer customerTest= new Customer("Cesar Cornejo");
    private Movie movieTest= new Movie("El señor de los anillos", 10);
    private Rental rentalTest=  new Rental(movieTest, 2);
    
    @Test
    public void testRentalGetDaysRented(){
        //Assert.assertEquals(3, rentalTest.getDaysRented()); //Falla
        Assert.assertEquals(2, rentalTest.getDaysRented()); //Pasa
    }
    
    @Test
    public void testRentalgetMovie(){
        //Movie rentalFail = new Movie("El señor de los anillos", 2);
        //Assert.assertEquals(rentalFail, rentalTest.getMovie()); //Falla
        Assert.assertEquals(movieTest, rentalTest.getMovie()); //Acierta
    }
    
    @Test
    public void testMovieGetPriceCode(){
        //Assert.assertEquals(3, movieTest.getPriceCode()); //Falla 
        Assert.assertEquals(10, movieTest.getPriceCode()); //Acierta
    }
    
    @Test
    public void testMovieSetPriceCode(){
        movieTest.setPriceCode(5);
        //Assert.assertEquals(10, movieTest.getPriceCode()); //Falla 
        Assert.assertEquals(5, movieTest.getPriceCode()); //Acierta
    }
    
    @Test
    public void testMovieGetTitle(){
        //Assert.assertEquals("Harry Potter", movieTest.getTitle()); //Falla
        Assert.assertEquals("El señor de los anillos", movieTest.getTitle()); //Acierta
    }
           
    @Test
    public void testCustomerGetName(){
        //Assert.assertEquals("Miguel Contreras", customerTest.getName()); //Falla
        Assert.assertEquals("Cesar Cornejo", customerTest.getName()); //Acierta
    }
    
    @Test
    public void testCustomerStatement(){
        customerTest.statement();
    }
}
