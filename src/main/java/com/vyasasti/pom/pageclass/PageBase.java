package com.vyasasti.pom.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageBase {

	PageBase()
	{
		
	}
	WebDriver driver;
	public PageBase(WebDriver driver) {
		this.driver=driver;
	}
	
	//common methods of all Page classes
	
	
	 boolean eleIsDisplayed(WebElement ele)
	{
		return  ele.isDisplayed();
	}

}
