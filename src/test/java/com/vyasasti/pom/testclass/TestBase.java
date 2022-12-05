package com.vyasasti.pom.testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
//common methods of all test classes
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void SetDriver()
	{
		 System.setProperty("webdriver.chrome.driver",
				  "D:\\AutomationAug2022\\PageObjectModel\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver(); 
	}
	
	@AfterSuite
	public void CloseDriver()
	{
		driver.quit();
	}
	
	
	
}
