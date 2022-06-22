package com.way2automation.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.ElementsPage;
import com.way2automation.qa.pages.LinksPage;
import com.way2automation.qa.pages.LoginPage;
import com.way2automation.qa.pages.UploadAndDownloadPage;

public class UploadAndDownloadPageTest extends TestBase{
	
	ElementsPage elementspage;
	LoginPage loginpage;
	UploadAndDownloadPage uploadanddownloadpage;

	public UploadAndDownloadPageTest() {
		super();
	}

	
	
	@BeforeMethod
	public void setup() {
				
		intialization();
		
		loginpage= new LoginPage();
		elementspage=new ElementsPage();
		
		elementspage= loginpage.ClickOnElementsTab();
		uploadanddownloadpage=elementspage.clickOnUploadAndDownloadTab();
			
	}
	
	
	@Test(priority=1)
	public void DownloadFileTest() {
		uploadanddownloadpage.DownloadFile();
		
	}
	
	@Test(priority=2)
	
	public void UploadFileTest() {
		uploadanddownloadpage.UploadFile();
		
	}
	
	
	
	
}
