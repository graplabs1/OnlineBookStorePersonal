package com.qa.testcasesmain;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.ProfilePage;
import com.qa.pages.RegisterPage;

public class RegisterPageTestcases extends TestBase {
	
	LoginPage loginpage;
	ProfilePage profilepage;
	RegisterPage registerpage;
	
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage= new LoginPage();
		registerpage = new RegisterPage();
	
	}
	
	
	@Test
	public void Check_BackToLogIn_Functionality_RehisterPAge() throws InterruptedException
	{
		registerpage= loginpage.click_newuser_button();
	    Thread.sleep(5000);
		loginpage=registerpage.cliclOnBackLoginBtn();
		 Thread.sleep(5000);
		loginpage.get_login_header_text();
		Assert.assertEquals(loginpage.get_login_header_text(), "Login");
		
		
	}
	
	@AfterMethod()
	public void tearDown()
	{
	driver.quit();	
	}

}
