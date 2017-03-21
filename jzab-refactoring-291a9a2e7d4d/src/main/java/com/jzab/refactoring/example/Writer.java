package com.jzab.refactoring.example;

import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
	
	Writer(String path, String result){
		try{
		    PrintWriter writer = new PrintWriter(path, "UTF-8");
		    writer.println(result);
		    writer.close();
		} catch (IOException e) {
		   // do something
		}
	}
}
