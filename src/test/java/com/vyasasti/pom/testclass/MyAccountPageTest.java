package com.vyasasti.pom.testclass;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vyasasti.pom.pageclass.MyAccountPage;

public class MyAccountPageTest extends TestBase{

	//assert validation TestNG
	
	MyAccountPage  mp;
	@BeforeClass
	public void  OpenBrowser()
	{
		mp=new MyAccountPage(driver);
		driver.get("https://practice.automationtesting.in/my-account/");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=1)
	public void verifyTitleofPage()
	{
		String expectedTitle="My Account – Automation Practice Site";
		String actualTitle=mp.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test(priority=2)
	public void VerifyLostPassworddisplay()
	{
		Assert.assertEquals(mp.LostPassworddisplay(), true);
	}
	
	@Test(priority=3)
	public void verifyLoginHeaderDisplayed()
	{
		Assert.assertTrue(mp.loginHeaderDisplay());
	}
	
	@Test(priority=4)
	public void verifyPasswordLostLinkEnabled()
	{
		Assert.assertEquals(mp.LostPasswordisEnabled(), true);
	}
	
	@Test(priority=5)
	public void verifyLoginSuccess()
	{
		Assert.assertTrue(mp.loginToMyAcount());
	}
	
   @AfterClass
   public void closeBrowser()
   {
	  driver.close();
   }
}
