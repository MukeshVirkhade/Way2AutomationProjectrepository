package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.util.TestUtil;

public class LoginPage extends TestBase {
	
	
	

	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[1]")
	WebElement ElementsTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[2]")
	WebElement FormsTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[3]")
	WebElement AlertsFramesWindowsTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[4]")
	WebElement Widgetstab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[5]")
	WebElement InteractionsTab;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[3]")
	WebElement BookStoreApplication;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]")
	WebElement PracticeFormElement;
	
	
	

public LoginPage() {
	PageFactory.initElements(driver,this);
}

//Actions:


public ElementsPage ClickOnElementsTab() {
	 executor =(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",ElementsTab);
	 //ElementsTab.click();
	 return new ElementsPage();
}


public FormsPage ClickOnFormsTab() {
	
	executor =(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",FormsTab);
	 
	 
	 executor =(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",PracticeFormElement);
	 
	 return new FormsPage();
	
}

//this is for practice 
public FormsPage2 ClickOnFormsTab2() {
	
	executor =(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",FormsTab);
	 
	 
	 executor =(JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",PracticeFormElement);
	 
	 return new FormsPage2();
	
}


	}
