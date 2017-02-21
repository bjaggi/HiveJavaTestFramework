package com.eva.sparkdemo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(AllPrecisionPricingTests.class);
		
      
      System.out.println( " ALL Tests Count  " + result.getRunCount()  );
      System.out.println( " Passed Tests Count  " + ( result.getRunCount()  - result.getFailureCount())  );
      System.out.println( " Ignored Tests Count  " + result.getIgnoreCount()  );
      
      System.out.println( " Tests Failed Count  " + result.getFailureCount()  );
      
      
      for (Failure failure : result.getFailures()) {
         System.out.println(" Printing failures : " + failure.toString());
      }
		
      System.out.println( " Printing Success : " +  result.wasSuccessful());
      
      
   }
}  	