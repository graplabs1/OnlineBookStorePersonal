package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class RegisterPage extends TestBase {
	

	
	@FindBy(xpath="//button[@id='gotologin']")
	WebElement gotologinbtn;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public LoginPage cliclOnBackLoginBtn()
	{
		gotologinbtn.click();
		return new LoginPage();
	}
	
	
	

}
