package com.vyasasti.pom.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends PageBase{
	WebDriver driver;
	public MyAccountPage(WebDriver d)
	{
		super(d);
		driver=d;
		PageFactory.initElements(driver, this);
	}

	//elements
	@FindBy(xpath="//h2[text()=\"Login\"]")
	private WebElement loginHeaderEle;
	
	@FindBy(linkText ="Lost your password?" )
	private WebElement passwordLostEle;
	
	@FindBy(id="username")
	private WebElement loginMailEle;
	
	@FindBy(id="password")
	private WebElement loginPassEle;
	
	@FindBy(xpath="//input[@name=\"login\"]")
	private WebElement loginButtonEle;
	
	@FindBy(xpath="//p[contains(text(),\"Hello\")]")
	private WebElement helloEle;
	
	//action
	public String getPageTitle()
	{
		return driver.getTitle();
	}
   public boolean LostPassworddisplay()
   {
	return eleIsDisplayed(passwordLostEle);
   }
   
   public boolean LostPasswordisEnabled()
   {
	return passwordLostEle.isEnabled();
   } 
   
   public boolean loginHeaderDisplay()
   {
	   return loginHeaderEle.isDisplayed();
   }
   
   public boolean loginToMyAcount()
   {
	   loginMailEle.sendKeys("vyasainstitute2022@gmail.com");
	   loginPassEle.sendKeys("Vyasa@12345");
	   loginButtonEle.click();
	   return  helloEle.isDisplayed();
   }
   
	
}
