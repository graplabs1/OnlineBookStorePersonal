package com.qa.doubtconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptchaConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/register");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		//How we c an take screnshot
		//java scriot executor
		//scroller handling
		//File upload and download
		//Keyboard handling--
		//git repositirt
		

	}

}
