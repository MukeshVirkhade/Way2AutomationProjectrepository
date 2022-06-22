package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2automation.qa.base.TestBase;

public class TextBoxPage extends TestBase{
	String comparefullname;
	String compareemail;
	String comparecurrentaddress;
	String comparepermanentaddress;
	
	@FindBy(xpath="//*[@id=\"userName\"]")
	WebElement FullNameTextBox;
	
	
	@FindBy(xpath="//*[@id=\"userEmail\"]")
	WebElement EmailTextBox;
	
	
	@FindBy(xpath="//*[@id=\"currentAddress\"]")
	WebElement CurrentAddressTextBox;
	
	@FindBy(xpath="//*[@id=\"permanentAddress\"]")
	WebElement PermanentAddressTextBox;
		
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement SubmitButton;
	
	//=========After clicking submit button==========
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement FullNameAfterSubmit;
	
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement EmailAfterSubmit;
	
	@FindBy(xpath="//*[@id=\"currentAddress\"]")
	WebElement CurrentAddressAfterSubmit;
	
	@FindBy(xpath="//*[@id=\"permanentAddress\"]")
	WebElement PermanentAddressAfterSubmit;
	
	
	public TextBoxPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void EnterFullname() {
		FullNameTextBox.sendKeys(prop.getProperty("FullName"));
	}
	
	public void EnterEmailID() {
		EmailTextBox.sendKeys(prop.getProperty("EmailID"));
	}
	
	public void EnterCurrentAddress() {
		CurrentAddressTextBox.sendKeys(prop.getProperty("Address"));
	}
	
	public void EnterPermanentAddress() {
		PermanentAddressTextBox.sendKeys(prop.getProperty("PermanentAddress"));
	}
	
	public void ClickOnSubmitButton() throws InterruptedException {
		executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",SubmitButton);
		
//		Thread.sleep(3000);
//		
//		comparefullname=FullNameAfterSubmit.getText();
//		compareemail=EmailAfterSubmit.getText();
//		comparecurrentaddress=CurrentAddressAfterSubmit.getText();
//		comparepermanentaddress=PermanentAddressAfterSubmit.getText();
//		
//		
//		Assert.assertEquals(compareemail, prop.getProperty("FullName"));		
//		Assert.assertEquals(compareemail, prop.getProperty("EmailId"));		
//		Assert.assertEquals(comparecurrentaddress, prop.getProperty("Address"));
//		Assert.assertEquals(comparepermanentaddress, prop.getProperty("PermanentAddress"));
		
	}
	
	
	
	

}
