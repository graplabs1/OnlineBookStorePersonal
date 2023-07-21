package com.qa.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	//Objects--Page Factory
	
	
@FindBy(id="userName")
WebElement username_txt;

@FindBy(xpath="//input[@id='password']")
WebElement password_txt;

@FindBy(id="login")
WebElement login_btn;

@FindBy(id="newUser")
WebElement newuser_btn;

@FindBy(xpath="//div[@class='main-header']")
WebElement login_header_label;

@FindBy(xpath="//div[@class='login-wrapper']//h2")
WebElement loginwelcome_label;

@FindBy(xpath="//div[@class='login-wrapper']//h5")
WebElement loginsubheader_label;
	

public LoginPage()
{
	PageFactory.initElements(driver, this);
	
}


//Actions

public String get_login_header_text()
{
	return login_header_label.getText();
	
}
	
public ProfilePage click_login_button(String un, String pwd)
{
	username_txt.sendKeys(un);
	password_txt.sendKeys(pwd);
	login_btn.click();
	return new ProfilePage();
	
}


public String get_login_subheader_text()
{
	String loginsubheader_txt= loginwelcome_label.getText().concat(loginsubheader_label.getText());
	
	return loginsubheader_txt;
}
public RegisterPage click_newuser_button()
{
	newuser_btn.click();
	return new RegisterPage();
	
} 
   
   
}

	
	
	
	
	
	


		

	


