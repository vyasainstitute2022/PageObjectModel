package com.vyasasti.pom.testclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vyasasti.pom.pageclass.MyAccountPage;
import com.vyasasti.pom.pageclass.TestCasesPage;

public class TestCasesPageTest extends TestBase {
	
	TestCasesPage  tc;
	@BeforeClass
	public void  OpenBrowser()
	{
		tc=new TestCasesPage(driver);
		driver.get("https://practice.automationtesting.in/test-cases/");
		driver.manage().window().maximize();
	}
	
	
	
	
	
	
	
	

}
