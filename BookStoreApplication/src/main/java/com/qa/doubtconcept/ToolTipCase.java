package com.qa.doubtconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ToolTipCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/tool-tips");
		Thread.sleep(2000);
		
		String Expectedtoottip="You hovered over Button";
		
		WebElement hoverMeButton= driver.findElement(By.id("toolTipButton"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(hoverMeButton).build().perform();
		//ac.moveToElement(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]/div[1]/input[1]"))).build().perform();
		//ac.click();
		Thread.sleep(2000);
		String actualtext=driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println(actualtext);
		if(actualtext.equals(Expectedtoottip))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		//Assert.assertEquals(actualtext, Expectedtoottip);
		driver.quit();
		

	}

}
