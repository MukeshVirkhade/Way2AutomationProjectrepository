package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.FormsPage;
import com.way2automation.qa.pages.FormsPage2;
import com.way2automation.qa.pages.LoginPage;

public class FormsPage2Test extends TestBase {
	
	
	LoginPage loginpage;
	FormsPage2 formspage;
	
	public FormsPage2Test() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
				
		intialization();
		
		loginpage= new LoginPage();
		formspage= new FormsPage2();
		
		formspage= loginpage.ClickOnFormsTab2();	
		Thread.sleep(5000);
	}
	
	
	@Test
	public void EnternameTest() throws InterruptedException {
		
		formspage.Entername();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
