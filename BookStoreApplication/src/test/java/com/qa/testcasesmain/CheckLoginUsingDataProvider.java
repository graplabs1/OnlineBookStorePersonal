package com.qa.testcasesmain;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.ProfilePage;
import com.qa.pages.RegisterPage;

public class CheckLoginUsingDataProvider extends TestBase {
	
	LoginPage loginpage;
	ProfilePage profilepage;
	RegisterPage registerpage;
	
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage= new LoginPage();
	
	}
	

	@Test
	public void check_validuser_login_functionality()
	{
		
		profilepage=loginpage.click_login_button(prop.getProperty("username"), prop.getProperty("password"));
		
		
	//	Assert.assertEquals(loginheader_actualtext, loginheader_expectedtext,"Login header text is not found");
		
		
	}
	
	
	@AfterMethod()
	public void tearDown()
	{
	driver.quit();	
	}

}
