package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LinksPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.TextBoxPage;

public class LinkPageTest extends TestBase{
	
	
	ElementsPage elementspage;
	LoginPage loginpage;
	LinksPage linkspage;
	

	public LinkPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
				
		intialization();
		
		loginpage= new LoginPage();
		elementspage=new ElementsPage();
		
		elementspage= loginpage.ClickOnElementsTab();
		linkspage= elementspage.clickOnLinksTab();
			
	}
	
	
	@Test(priority=1)
	public void ClickOnHomeLinkTest() {
		
		linkspage.ClickOnHomeLink();
	}
	
	
	@Test(priority=2)
	public void ClickOnHome19v3LinkTest() {
		
		linkspage.ClickOnHome19v3Link();
	}
	
	@Test(priority=3)
	public void ClickOnCreatedLinkTest() {
		linkspage.ClickOnCreatedLink();
	}
	
	@Test(priority=4)
	public void ClickOnNoContentLinkTest() {
		linkspage.ClickOnNoContentLink();
	}
	
	
	@Test(priority=5)
	public void ClickOnMovedLinkTest() {
		linkspage.ClickOnMovedLink();
	}
	
	@Test(priority=6)
	public void ClickOnBadRequestLinkTest() {
		linkspage.ClickBadRequestLink();
	}
	
	@Test(priority=7)
	public void ClickOnUnauthorizedLinkTest() {
		linkspage.ClickUnauthorizedLink();
	}
	
	@Test(priority=8)
	public void ClickOnForbiddenLinkTest() {
		linkspage.ClickForbiddenLink();
	}
	
	@Test(priority=9)
	public void ClicOnNotFoundLinkTest() {
		linkspage.ClickOnNotFoundLink();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	
	
}
