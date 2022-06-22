package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ButtonsPage;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.WebTablesPage;

public class ButtonsPageTest extends TestBase{
	ElementsPage elementspage;
	ButtonsPage buttonspage;
	LoginPage loginpage;
	
	
	public ButtonsPageTest() {
		super();
	}
	

	@BeforeMethod
	public void setup() {
				
		intialization();
		
		loginpage= new LoginPage();
		elementspage=new ElementsPage();
		elementspage= loginpage.ClickOnElementsTab();
		elementspage.clickOnButtonsTab();
			
		
	}
	
	@Test(priority=1)
	public void ClickOnDoubleClickButtonTest() {
		buttonspage.ClickOnDoubleClickButton();
		
	}
	
	@Test(priority=2)
	public void ClickOnRightClickButtonTest() {
		buttonspage.ClickOnRightClickButton();
		
	}
	
	@Test(priority=3)
	public void ClickOnRightClickMeTest() {
		buttonspage.ClickOnClickMeButton();
		
	}
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	

}
