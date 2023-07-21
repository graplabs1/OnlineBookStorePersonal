package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGConstructorConcept {
	
	public TestNGConstructorConcept()
	{
		
		System.out.println("Default constructor");
		
	}
	
	public TestNGConstructorConcept(String un)
	{
		
		System.out.println("parametized constructor");
		
	}
	
	
	@BeforeMethod
	public void setup()
	{
		System.out.println("Set up");
		
	}
	
	@Test
	public void Testcase1()
	{
		System.out.println("Tst1");
	}
	
	@Test
	public void Testcase2()
	{
		System.out.println("Tst2");
	}
	
	@Test
	public void Testcase3()
	{
		System.out.println("Tst3");
	}
	
	@AfterMethod
	public void tesrDown()
	{
		System.out.println("Shut Down");
	}
	

}
