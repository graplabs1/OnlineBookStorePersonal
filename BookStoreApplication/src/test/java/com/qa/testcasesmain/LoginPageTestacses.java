package com.qa.testcasesmain;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.pages.ProfilePage;
import com.qa.pages.RegisterPage;


@Listeners(CustomListeners.class)
public class LoginPageTestacses extends TestBase {
	
	
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
	public void check_login_header_text()
	{
		String loginheader_expectedtext="Login1";
		String loginheader_actualtext=loginpage.get_login_header_text();
		
//		System.out.println(this.getClass().getSimpleName());
//		System.out.println(this.getClass().getName());
//		System.out.println(this.getClass().getCanonicalName());
		
		Assert.assertEquals(loginheader_actualtext,loginheader_expectedtext);
	//	Assert.assertEquals(loginheader_actualtext, loginheader_expectedtext,"Login header text is not found");
		
	}
	
	
	@Test
	public void check_login_subheader_text()
	{		
		Assert.assertEquals(loginpage.get_login_subheader_text(),prop.getProperty("loginsubheader"));
	
	}
	
	@Test
	public void check_validuser_login_functionality()
	{
		
		profilepage=loginpage.click_login_button(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(false);
		
		
//	//	Assert.assertEquals(loginheader_actualtext, loginheader_expectedtext,"Login header text is not found");
//		
//		
	}
	
	@Test
	public void Check_NewUser_ButtonFuctionalityonLoginPage()
	{
		registerpage=loginpage.click_newuser_button();
		Assert.assertTrue(false);
	}
	
	
	@AfterMethod()
	public void tearDown()
	{
	driver.quit();	
	}

}
