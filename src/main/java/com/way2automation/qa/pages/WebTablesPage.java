package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.util.TestUtil;

public class WebTablesPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"addNewRecordButton\"]")
	WebElement AddNewRecordButton;
	
	
	@FindBy(xpath="//*[@id=\"searchBox\"]")
	WebElement SearchBox;
	
	
	@FindBy(xpath="//*[@id=\"basic-addon2\"]")
	WebElement SearchButton;
	
	//=====Locators for adding a row=========
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement FirstNameInputBox;
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement LastNameInputBox;
	
	
	@FindBy(xpath="//*[@id=\"userEmail\"]")
	WebElement EmailInputBox;
	
	
	
	@FindBy(xpath="//*[@id=\"age\"]")
	WebElement AgeInputBox;
	
	
	
	@FindBy(xpath="//*[@id=\"salary\"]")
	WebElement SalaryInputBox;
	
	

	@FindBy(xpath="//*[@id=\"department\"]")
	WebElement DepartmentInputBox;
	
	

	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement SubmitButton;
	
	
public WebTablesPage() {
		
		PageFactory.initElements(driver,this);
	}


public void ClickOnAddButton() {

	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",AddNewRecordButton);
	
}

public void EnterFirstName() {
	wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
 	wait.until(ExpectedConditions.visibilityOf(FirstNameInputBox));
 	
	FirstNameInputBox.sendKeys(prop.getProperty("FirstName"));	
}

public void EnterLastName() {
	wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
 	wait.until(ExpectedConditions.visibilityOf(LastNameInputBox));
	LastNameInputBox.sendKeys(prop.getProperty("LastName"));
}

public void EnterEmailID() {
	wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
 	wait.until(ExpectedConditions.visibilityOf(EmailInputBox));
	EmailInputBox.sendKeys(prop.getProperty("EmailID"));
}

public void EnterAge() {
	wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
 	wait.until(ExpectedConditions.visibilityOf(AgeInputBox));
	AgeInputBox.sendKeys(prop.getProperty("Age"));
}

public void EnterSalary() {
	wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
 	wait.until(ExpectedConditions.visibilityOf(SalaryInputBox));
	SalaryInputBox.sendKeys(prop.getProperty("Salary"));
}

public void EnterDepartmentName() {
	wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
 	wait.until(ExpectedConditions.visibilityOf(DepartmentInputBox));
	DepartmentInputBox.sendKeys(prop.getProperty("DepartmentName"));
	
}

public void ClickSubmitButton() {
	executor =(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",SubmitButton);
}


}
