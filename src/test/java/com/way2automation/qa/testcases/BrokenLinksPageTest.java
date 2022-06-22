package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.BrokenLinksPage;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LoginPage;

public class BrokenLinksPageTest extends TestBase{
	
	ElementsPage elementspage;
	LoginPage loginpage;
	BrokenLinksPage brokenlinkspage;
	
	
	public BrokenLinksPageTest() {
		//this will call the base class constructor
		super();
	}
	

	@BeforeMethod
	public void setup() {
			
		intialization();
		
		loginpage= new LoginPage();
		elementspage= new ElementsPage();		
		elementspage= loginpage.ClickOnElementsTab();
		brokenlinkspage=elementspage.clickOnBrokenLinksTab();
		
	}
	
	@Test(priority=1)
	public void VerifyValidImageTest() {
		brokenlinkspage.VerifyValidImage();
	}
	
	@Test(priority=2)
	public void VerifyBrokenImageTest() {
		brokenlinkspage.VerifyBrokenImage();
	}
	
	@Test(priority=3)
	public void verifyLinksTest() {
		brokenlinkspage.VerifyBrokenLink();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
