/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jzab.refactoring.example;

/**
 *
 * @author Ari
 */
public class consoleReporter implements Reporter{

    @Override
    public void report(String report) {
        System.out.print(report);
    }
    
    
}
