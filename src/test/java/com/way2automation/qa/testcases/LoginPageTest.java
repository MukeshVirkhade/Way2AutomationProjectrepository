package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	ElementsPage elemetspage;
	
	// calling the super class constructor
	public  LoginPageTest() {
	  super();
	}
	
	
	@BeforeMethod
	public void setup() {
		intialization();
		
		loginpage=new LoginPage();
	}
	
	@Test
	public void ClickElementsTabTest() {
		elemetspage= loginpage.ClickOnElementsTab();
	}

	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}

