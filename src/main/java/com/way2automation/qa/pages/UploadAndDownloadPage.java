package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2automation.qa.base.TestBase;

public class UploadAndDownloadPage extends TestBase {
	
	String downloadpath="C:\\Users\\Lenovo\\Downloads";
	String uploadedfilepathcompare;

	
	@FindBy(xpath="//*[@id=\"downloadButton\"]")
	WebElement DownloadButton;
	
	@FindBy(xpath="//*[@id=\"uploadFile\"]")
	WebElement uploadFileButton;
	
	@FindBy(xpath="//*[@id=\"uploadedFilePath\"]")
	WebElement uploadedfilepath;
	

	public UploadAndDownloadPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void DownloadFile() {
		
		executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",DownloadButton);
		
	 
	}
	
	public void UploadFile() {
		
		executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",uploadFileButton);
		
		uploadFileButton.sendKeys("C:\\Users\\Lenovo\\eclipse-worksp\\Way2AutomationTest\\src\\main\\java\\com\\way2automation\\qa\\util\\sampleFile.jpeg");
		
		
		uploadedfilepathcompare=uploadedfilepath.getText();
		
	    if (uploadedfilepathcompare.contains("C:\\fakepath")) {
	    	System.out.println("file sucessfully uploaded");
	    }
	    else {
	    	System.out.println("file is not uploaded");
	    }
		
		
		
	}
	
	
	
}
