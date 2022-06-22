package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.way2automation.qa.base.TestBase;

public class ButtonsPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"doubleClickBtn\"]")
	WebElement DoubleClickButton;
	
	@FindBy(xpath="//*[@id=\"rightClickBtn\"]")
	WebElement RightClickButton;
	
	@FindBy(xpath="//*[@id=\"JAUWa\"]")
	WebElement ClickMeButton;
	//===========================================Verification of texts after click
	
	@FindBy(xpath="//*[@id=\"doubleClickMessage\"]")
	WebElement DoubleClickMessage;
	
	@FindBy(xpath="//*[@id=\"rightClickMessage\"]")
	WebElement RightClickMessage;
	
	
	@FindBy(xpath="//*[@id=\"dynamicClickMessage\"]")
	WebElement ClickMessage;
	
	String doubleclickmessagetext;
	String rightclickmessagetext;
	String clickmessagetext;
	
	
	
	
	
	
	public ButtonsPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	public void ClickOnDoubleClickButton() {
		
		act=new Actions(driver);
		act.doubleClick(DoubleClickButton);
		
		doubleclickmessagetext=DoubleClickMessage.getText();
		
		Assert.assertEquals(doubleclickmessagetext,prop.getProperty("DoubleClickTextMessageExpected"));
		
		
		
	}

	public void ClickOnRightClickButton() {
		
		act=new Actions(driver);
		act.contextClick(RightClickButton);
		
		rightclickmessagetext= RightClickMessage.getText();
				
		Assert.assertEquals(rightclickmessagetext,prop.getProperty("RightClickTextMessageExpected"));
	}

      public void ClickOnClickMeButton() {
    	  executor =(JavascriptExecutor)driver;
  		  executor.executeScript("arguments[0].click();",ClickMeButton);
  		  
  		clickmessagetext=ClickMessage.getText();
  		  
  		Assert.assertEquals(clickmessagetext,prop.getProperty("DynamicClickTextMessageExpected"));
  		
  		
			
	}
}
