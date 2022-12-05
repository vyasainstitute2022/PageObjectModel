package com.vyasasti.pom.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends PageBase{
	WebDriver driver;
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	//elements
	@FindBy(xpath="//h2[text()=\"Login\"]")
	private WebElement loginHeaderEle;
	
	@FindBy(linkText ="Lost your password?" )
	private WebElement passwordLostEle;
	
	//action
	public String getPageTitle()
	{
		return driver.getTitle();
	}
   public boolean LostPassworddisplay()
   {
	return passwordLostEle.isDisplayed();
   }
   
   public boolean LostPasswordisEnabled()
   {
	return passwordLostEle.isEnabled();
   } 
   
   public boolean loginHeaderDisplay()
   {
	   return loginHeaderEle.isDisplayed();
   }
	
}
