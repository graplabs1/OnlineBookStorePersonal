package com.qa.doubtconcept;

import java.io.File;
import java.time.*;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import org.apache.commons.io.FileUtils;





public class TakeScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/register");
		
		
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//System.out.println(java.time.LocalDateTime.now());
		File destfile= new File("E:\\Maven_WS_DailyBatch\\BookStoreApplication\\src\\main\\java\\Screenshot\\screenshot.png");
	FileUtils.copyFile(srcfile, destfile);
	driver.quit();
		

	}

}
