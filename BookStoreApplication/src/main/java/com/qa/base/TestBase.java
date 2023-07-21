package com.qa.base;

import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.*;
import java.time.Duration;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() 
	{
		try {
		prop= new Properties();
		FileInputStream in= new FileInputStream("E:\\Maven_WS_DailyBatch\\BookStoreApplication\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(in);
		} 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void initilization()
	{
		
		if(prop.getProperty("browser").equals("chrome"))
		{
		
		driver = new ChromeDriver();
		
		}
		else
		{
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//below is the imlicit wait to wait till the all the elemenst gets loaded within the specified time period.
		// incase all the elemnst are loaded before the time, it will continue with the scipt
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0))
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		driver.get(prop.getProperty("URL"));
		
	}
	
	
	public void takescreenshot(String testcase_method_name) throws IOException
	{
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalDateTime.now());
		System.out.println(java.time.LocalTime.now());
		
		File destfile= new File("E:\\Maven_WS_DailyBatch\\BookStoreApplication\\src\\main\\java\\Screenshot\\"+ testcase_method_name+java.time.LocalDate.now()+"failedTestcase.png");
	FileUtils.copyFile(srcfile, destfile);
		
		
	}
	
	

}
