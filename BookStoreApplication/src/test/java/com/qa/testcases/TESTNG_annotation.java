package com.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.*;

public class TESTNG_annotation {

	
// BeforeMethod and AfterMethod annotation is run for each test defined in the class
// We cant set the order of testcase execution using priority
	//We can grouped our testcases based on our requirement
	//We can manage testcases if it is depends on any other testcases
	
@BeforeMethod
public void BasicTest()
{
	System.out.println("Basic Test in Before Method annotation");
}
	
	
@Test(priority = 4, groups="Smoke")
public void Testcase1()
{
	System.out.println("Testcase1 executed");
}


@Test(priority = 3, groups="Smoke")
public void Testcase2()
{
	System.out.println("Testcase2 executed");
}

@Test(priority = 1, groups="Regression")
public void Testcase3()
{
	System.out.println("Testcase3 executed");
}


@Test(priority = 2, groups="Regression")
public void Testcase4()
{
	System.out.println("Testcase4 executed");
}


@Test
public void ParentTestcase()
{
	System.out.println("Parenet executed");
	Assert.assertTrue(false);
	
}

@Test(dependsOnMethods="ParentTestcase")
public void ChildTestcase()
{
	
	System.out.println("Child executed");
}


@AfterMethod
public void AfterTest()
{
	System.out.println("Afetr Test afetr Method annotation");
}
	

}
