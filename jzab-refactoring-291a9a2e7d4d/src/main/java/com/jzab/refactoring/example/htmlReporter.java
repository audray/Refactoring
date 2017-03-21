/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jzab.refactoring.example;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ari
 */
public class htmlReporter implements Reporter{


    @Override
    public void report(String report) {
        String path= "report.html";
        try{
		    PrintWriter writer = new PrintWriter(path, "UTF-8");
                    writer.println("<!DOCTYPE html>");
                    writer.println("<html>");
                    writer.println("<head></head>");
                    writer.println("<body>");
                    writer.println("<div>");
                    writer.println("<p>");
		    writer.println(report);
                    writer.println("</p>");
                    writer.println("</div>");
                    writer.println("</body>");
                    writer.println("</html>");
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
    }
    
}
