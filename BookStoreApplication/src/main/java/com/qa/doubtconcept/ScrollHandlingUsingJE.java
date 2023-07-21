package com.qa.doubtconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandlingUsingJE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/basic_init/scroll_y.html");
		Thread.sleep(2000);
	//WebElement scrolldest=	driver.findElement(By.xpath("//h2[text()='Other examples']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");//this will scroll ur page to 1000 px from the top
		//js.executeScript("window.scrollTo(0,1000);");//it will always scroll from the top
		//js.executeScript("arguments[0].scrollIntoView();", scrolldest);//it will scroll the page to the provided web elemenbet
js.executeScript("document.querySelector('.dataTables_scrollBody').scrollBy(0,600);");
	}

}
