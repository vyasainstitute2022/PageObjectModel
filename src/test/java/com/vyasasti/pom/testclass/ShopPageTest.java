package com.vyasasti.pom.testclass;

import org.testng.annotations.BeforeClass;
import com.vyasasti.pom.pageclass.ShopPage;

public class ShopPageTest extends TestBase{
	// validation test cases for  shop page
	ShopPage  sp;
	@BeforeClass
	public void  OpenBrowser()
	{
		sp=new ShopPage(driver);
		driver.get("https://practice.automationtesting.in/shop/");
		driver.manage().window().maximize();
	}
	
	// @test 
	
	// call respective methods from page class and validate with assert
	

}
