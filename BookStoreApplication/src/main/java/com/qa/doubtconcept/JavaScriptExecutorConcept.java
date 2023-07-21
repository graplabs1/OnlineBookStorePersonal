package com.qa.doubtconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//JavascriptExecutor-- is a interface that is used to execute javascript
		//sometime we do not able to find elements then javascript is used
		//javascript we can easily set the attribute value
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/date-picker");
		Thread.sleep(2000);
		WebElement selectDate= driver.findElement(By.id("datePickerMonthYearInput"));
		WebElement selectDatetime= driver.findElement(By.id("dateAndTimePickerInput"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='05/25/2022';", selectDate);
		js.executeScript("arguments[0].value='May 26, 2022 5:00 AM';", selectDatetime);
		//js.executeScript("arguments[0],setAttribute('value','05/25/2022')", selectDate)
		//js.executeScript("arguments[0].style.backgroundColor='#dfff'",webelement)
		//js.executeScript("arguments[0].setAttribute('specufy attribute anme','100')",webelement)
		
	//	WebElement selectDate= driver.findElement(By.id("datePickerMonthYearInput"));
//		selectDate.click();
//		Thread.sleep(2000);
//		Select month= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
//		month.selectByVisibleText("May");
//		Thread.sleep(2000);
//		Select year= new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
//		year.selectByVisibleText("2022");
//		Thread.sleep(1000);
//		////div[@aria-label='Choose Wednesday, June 22nd, 2022']
//		WebElement day = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, May 26th, 2022']"));
//		
//		
//		
//		System.out.println(day.getText());
//		//day.click();
//		
//		Actions act= new Actions(driver);
//		act.click(day).build().perform();
//		//act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'22')]"))).build().perform();
//		//act.click();
		
		
		

	}

}
