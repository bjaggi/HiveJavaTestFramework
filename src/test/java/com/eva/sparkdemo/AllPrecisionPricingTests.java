package com.eva.sparkdemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCIFDQ.class })
public class AllPrecisionPricingTests {
	
	@Before
	void setup(){
		System.out.println("======================> Creating Connection with HIVE <===============================");
		System.out.println( "Connection Statement is : " + Connectionfactory.getStamentInstance());
		
	}

}
