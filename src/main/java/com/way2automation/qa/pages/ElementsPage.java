package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.util.TestUtil;

public class ElementsPage extends TestBase {
	
	
	//Locators under elements dropdown
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]")
	WebElement TextBoxButton;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]")
	WebElement CheckBoxButton;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]")
	WebElement RadioButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]")
	WebElement WebTablesButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]")
	WebElement ButtonsButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]")
	WebElement LinksButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[7]")
	WebElement BrokenLinksButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]")
	WebElement UploadAndDownloadButton;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[9]")
	WebElement DynamicPropertiesButton;
	
	
	//@FindBy(xpath="//a[contains(text(),'Deals')]")
	//*[@class='btn btn-light active']
	
	
	
	public ElementsPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	//Actions
	public TextBoxPage clickOnTextBoxTab()  {
		
//		wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
//		wait.until(ExpectedConditions.elementToBeClickable(TextBoxButton));
				
		TextBoxButton.click();
		
		return new TextBoxPage();
	}
	
public CheckBoxPage clickOnCheckBoxTab() {
						
	CheckBoxButton.click();
		return new CheckBoxPage();
	}
	
	
public RadioButtonPage clickOnRadioButtonTab() {
	
	    		
		executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",RadioButton);
		return new RadioButtonPage();
	}


public WebTablesPage clickOnWebTablesTab() {

	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",WebTablesButton);
	return new WebTablesPage();
	
}

public ButtonsPage clickOnButtonsTab() {
	
	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",ButtonsButton);
	return new ButtonsPage();
	
}

public  LinksPage clickOnLinksTab() {
	
	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",LinksButton);
	return new LinksPage();
}


public  BrokenLinksPage clickOnBrokenLinksTab() {
	
	
	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",BrokenLinksButton);
	
	return new BrokenLinksPage();
}


public UploadAndDownloadPage clickOnUploadAndDownloadTab() {
	
	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",UploadAndDownloadButton);
	
	return new UploadAndDownloadPage();
}
   

public DynamicPropertiesPage clickOnDynamicPropertiestab() {

	
	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",DynamicPropertiesButton);
	
	return new DynamicPropertiesPage();
}













}
