package com.qa.testcasesmain;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.base.TestBase;

public class CustomListeners extends TestBase implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
		try {
			takescreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    // not implemented
	  }
	
//	public void onTestSuccess(ITestResult result) {
//		
//		try {
//			takescreenshot();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	    // not implemented
	   
		
	  }
	
	
	


