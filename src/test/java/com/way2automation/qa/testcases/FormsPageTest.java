package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.FormsPage;
import com.way2automation.qa.pages.LinksPage;
import com.way2automation.qa.pages.LoginPage;

public class FormsPageTest extends TestBase {
	

	
	LoginPage loginpage;
	FormsPage formspage;
	
	
	
	public FormsPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
				
		intialization();
		
		loginpage= new LoginPage();
		formspage= new FormsPage();
		
		formspage= loginpage.ClickOnFormsTab();			
	}
	
	@Test(priority=1)
	public void EnternameTest() {
		formspage.Entername();
	}
	
	@Test(priority=2)
	public void EnterLastNameTest() {
		formspage.EnterLastName();
	}
	
	@Test(priority=3)
	public void EnterEmailTest() {
		formspage.EnterEmail();
	}
	
	
	@Test(priority=4)
	public void SelectradioButtonTest() {
		formspage.SelectradioButton();
	}
	
	@Test(priority=5)
	public void EnterSubjectsTest() {
		formspage.EnterSubjects();
	}
	
	@Test(priority=6)
	public void SelectHobbiesTest() {
		formspage.SelectHobbies();
	}
	
	@Test(priority=7)
	public void UploadFileTest() {
		formspage.UploadFile();
	}
	
	@Test(priority=8)
	public void EnterCurrentAddressTest() {
		formspage.EnterCurrentAddress();
	}
	
	
	@Test(priority=9)
	public void SelectStateTest() {
		formspage.SelectState();
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
