package com.vyasasti.pom.pageclass;

import org.openqa.selenium.WebDriver;

public class PageBase {

	PageBase()
	{
		
	}
	WebDriver driver;
	public PageBase(WebDriver driver) {
		this.driver=driver;
	}
	
	//common methods of all Page classes
	

}
