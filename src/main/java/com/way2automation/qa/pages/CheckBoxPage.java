package com.way2automation.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.way2automation.qa.base.TestBase;

public class CheckBoxPage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"tree-node\"]/ol/li/span/button")
	WebElement HomeToggleButton;
	
	public CheckBoxPage() {
		
	}

}
