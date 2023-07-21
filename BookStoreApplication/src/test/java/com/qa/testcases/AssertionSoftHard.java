package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftHard {
	
	SoftAssert SA= new SoftAssert();
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Set up");
	}
	
	
	@Test
	public void testcase1()
	{   String at="Vijay";
	String et="Vijaya";
		System.out.println("Statement1");
		System.out.println("Statement2");
		SA.assertEquals(at, et);//Soft Assertion
		
		//Assert.assertEquals(at, et);//match get failed--Hard assertion
		System.out.println("Statement3");
		System.out.println("Statement4");
		SA.assertAll();
	}
	
	@AfterMethod
	public void setdown()
	{
		System.out.println("Set down");
	}

}
