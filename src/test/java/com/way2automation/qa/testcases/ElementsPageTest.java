package com.way2automation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.BrokenLinksPage;
import com.way2automation.qa.pages.ButtonsPage;
import com.way2automation.qa.pages.CheckBoxPage;
import com.way2automation.qa.pages.DynamicPropertiesPage;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LinksPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.RadioButtonPage;
import com.way2automation.qa.pages.TextBoxPage;
import com.way2automation.qa.pages.UploadAndDownloadPage;
import com.way2automation.qa.pages.WebTablesPage;

public class ElementsPageTest extends TestBase{
	
	ElementsPage elementspage;
	TextBoxPage  textboxpage;
	LoginPage loginpage;
	CheckBoxPage checkboxpage;
	RadioButtonPage radioButtonPage;
	WebTablesPage webtablespage;
	ButtonsPage buttonspage;
	LinksPage linkspage;
	BrokenLinksPage brokenlinkspage;
	UploadAndDownloadPage uploadanddownloadpage;
	DynamicPropertiesPage dynamicpropertiespage;
	
	public ElementsPageTest() {
		//this will call the base class constructor
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		// this will call the intialization method from base class
		
		intialization();
		
		loginpage= new LoginPage();
		elementspage= loginpage.ClickOnElementsTab();
		
		//elementspage=new ElementsPage();
		
	}
	
	@Test(priority=1)
	public void ClickTextBoxTabTest() {
		textboxpage=elementspage.clickOnTextBoxTab();
	}
	
	@Test(priority=2)
	public void ClickCheckBoxTabTest() {
		checkboxpage=elementspage.clickOnCheckBoxTab();
	}
	
	
	@Test(priority=3)
	public void ClickOnRadioButtonTabTest() {
		radioButtonPage= elementspage.clickOnRadioButtonTab();
		
	}
	
    @Test(priority=4)
    public void ClickOnWebTablesTabTest() {
    	webtablespage=elementspage.clickOnWebTablesTab();
    	
    }
    
    
    @Test(priority=5)
    public void ClickOnButtonsTabTest() {
    	buttonspage=elementspage.clickOnButtonsTab();
    	
    }
    
    @Test(priority=6)
    public void ClickOnLinksTabTest() {
    	linkspage=elementspage.clickOnLinksTab();
    	   	
    }
    
    @Test(priority=7)
    public void ClickOnBrokenLinksTabTest() {
    	brokenlinkspage=elementspage.clickOnBrokenLinksTab();    	 	
    }
    
    @Test(priority=8)
    public void clickOnUploadAndDownloadsTabTest() {
    	uploadanddownloadpage=elementspage.clickOnUploadAndDownloadTab();
    }
    
    @Test(priority=9)
    public void clickOnDynamicPropertiesTabTest() {
    	dynamicpropertiespage=elementspage.clickOnDynamicPropertiestab();
    }
    
    
    
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
