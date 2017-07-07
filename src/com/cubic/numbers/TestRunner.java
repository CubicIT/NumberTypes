package com.cubic.numbers;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


import junit.framework.*;

public class TestRunner {

	 public static void main(String[] args) {
		
		 Result result = JUnitCore.runClasses(NumbersTest.class);
		 
		 for(Failure r : result.getFailures())
		 {
			System.out.println(r.getTrace()); 
		 }
		 
		 System.out.println(result.wasSuccessful());
	}
}
