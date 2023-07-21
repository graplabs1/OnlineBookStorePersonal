package com.qa.testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTestcaseByTestNG {
	
	WebDriver driver;
	
@BeforeMethod
public void Driver_Setup()
{
	 driver= new ChromeDriver();
	driver.get("https://demoqa.com/login");
	
}

@AfterMethod
public void Driver_Exit()
{
	driver.quit();
	
}
	
	
@Test
public void Verify_HeaderContent_Login_Page()
{ 
	
	
	String login_header_expetedtext="Login";
	//In Tetng we would acheiev validation thrpugh Assert methds
	// Assert.assertEquals(Actual TExt;Expected Text;Text incase this maytch get failed)
	String login_header_actualtext= driver.findElement(By.xpath("//div[@class='main-header']")).getText();
Assert.assertEquals(login_header_actualtext,login_header_expetedtext ,"Titile is not there");

	
}

@Test
public void Verify_USernamePassword_Labels_LoginPage()
{
	
	String username_label_expected="UserName :";
	String password_label_expected="Password :";
	
	String username_label_Actual=driver.findElement(By.id("userName-label")).getText();
	String password_label_Actual=driver.findElement(By.id("password-label")).getText();

	Assert.assertEquals(username_label_Actual, username_label_expected,"Username is not found");
	Assert.assertEquals(password_label_Actual, password_label_expected,"PAssword is not found");
	
	
	//Assert.assertTrue(value<100);//TEstNG faield those testcase whose aseert method reruen false
}
	
@Test
public void Verify_Login_text_dislayed_LoginButton()
{

	
	String login_button_expected_text="Login";
	String login_button_actual_text=driver.findElement(By.id("login")).getText();
	Assert.assertEquals(login_button_actual_text, login_button_expected_text,"Login is not shown in Login BUtton");
	
	
	
}	
	

}
