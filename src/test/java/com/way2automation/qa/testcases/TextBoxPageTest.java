package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.TextBoxPage;

public class TextBoxPageTest extends TestBase {
	ElementsPage elementspage;
	TextBoxPage  textboxpage;
	LoginPage loginpage;
	
	public TextBoxPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
				
		intialization();
		
		loginpage= new LoginPage();
		elementspage=new ElementsPage();
		
		elementspage= loginpage.ClickOnElementsTab();
		textboxpage=elementspage.clickOnTextBoxTab();
			
	}
	
	
	@Test(priority=1)
	public void EnterFullNameTest() {
		 textboxpage.EnterFullname();
		
		}
		
	@Test(priority=2)
	public void EnterEmailIDTest() {
		textboxpage.EnterEmailID();
		
	}
	
	@Test(priority=3)
	public void EnterCurrentAddressTest() {
		textboxpage.EnterCurrentAddress();
		
	}
	
	@Test(priority=4)
	public void EnterPermanentAddressTest() {
		textboxpage.EnterPermanentAddress();
		
	}
	
	@Test(priority=5)
	public void ClickSubmitButtonTest() throws InterruptedException {
		textboxpage.ClickOnSubmitButton();
	
	}
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
