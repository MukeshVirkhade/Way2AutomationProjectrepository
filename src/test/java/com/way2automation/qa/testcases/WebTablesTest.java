package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.TextBoxPage;
import com.way2automation.qa.pages.WebTablesPage;

public class WebTablesTest extends TestBase {
	ElementsPage elementspage;
	WebTablesPage webtablespage;
	LoginPage loginpage;
	

	public WebTablesTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
				
		intialization();
		
		loginpage= new LoginPage();
		elementspage=new ElementsPage();
		
		elementspage= loginpage.ClickOnElementsTab();
		webtablespage=elementspage.clickOnWebTablesTab();
		webtablespage.ClickOnAddButton();
	}
	
	
	
	@Test(priority=1)
	public void EnterFirstNameTest() {
		webtablespage.EnterFirstName();
	}
	
	@Test(priority=2)
	public void EnterLastNameTest() {
		webtablespage.EnterLastName();
	}
	
	@Test(priority=3)
	public void EnterEmailIDTest() {
		webtablespage.EnterEmailID();
	}
	
	@Test(priority=4)
	public void EnterAgeTest() {
		webtablespage.EnterAge();
	}
	
	@Test(priority=5)
	public void EnterSalarytest() {
		webtablespage.EnterSalary();
	}
	
	@Test(priority=6)
	public void EnterDepartmentNameTest() {
		webtablespage.EnterDepartmentName();
	}
	
	@Test(priority=7)
	public void ClickSubmitButtonTest() {
		webtablespage.ClickOnAddButton();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
