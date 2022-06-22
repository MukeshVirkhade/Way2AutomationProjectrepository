package com.way2automation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.qa.base.TestBase;

public class RadioButtonPage extends TestBase {
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")
	WebElement YesradioButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label")
	WebElement ImpressiveRadioButton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[4]/label")
	WebElement NoRadioButton;
	
	public RadioButtonPage() {
		
		PageFactory.initElements(driver,this);
	}

	
	public void ClickYesRadioButton() {
		boolean isenabled= YesradioButton.isEnabled();
		
		if(isenabled==true) {
			YesradioButton.click();
		}
	}
	
	public void ClickImpressiveRadioButton() {
		boolean isenabled= ImpressiveRadioButton.isEnabled();
		
		if(isenabled==true) {
			ImpressiveRadioButton.click();
		}
	}
	
	public void ClickNoRadioButton() {
		boolean isenabled= NoRadioButton.isEnabled();
		
		if(isenabled==true) {
			NoRadioButton.click();
		}
	}
	
	
	
	
}
