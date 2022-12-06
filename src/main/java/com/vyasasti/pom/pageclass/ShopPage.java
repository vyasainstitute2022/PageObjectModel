package com.vyasasti.pom.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends PageBase {
	WebDriver driver;
	public ShopPage(WebDriver d)
	{
		super(d);
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	// element
	
	
	
		// actions
		
	
	
	
	
	
}
