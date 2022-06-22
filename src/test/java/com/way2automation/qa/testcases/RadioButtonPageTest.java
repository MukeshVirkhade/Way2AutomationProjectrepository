package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.RadioButtonPage;

public class RadioButtonPageTest extends TestBase{
	LoginPage loginpage;
	ElementsPage elementspage;
	RadioButtonPage radiobuttonpage;
	
	public RadioButtonPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		intialization();
		
		loginpage=new LoginPage();
		elementspage=new ElementsPage();
		
		elementspage= loginpage.ClickOnElementsTab();
	
		radiobuttonpage=elementspage.clickOnRadioButtonTab();
	}
	
	
	@Test(priority=1)
	public void ClickYesRadioButtonTest() {
		radiobuttonpage.ClickYesRadioButton();
	}
	
	@Test(priority=2)
	public void ClickImpressiveRadiobuttonTest() {
		radiobuttonpage.ClickImpressiveRadioButton();
	}
	
	@Test(priority=3)
	public void ClickNoRadiobuttonTest() {
		radiobuttonpage.ClickNoRadioButton();
	}
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
