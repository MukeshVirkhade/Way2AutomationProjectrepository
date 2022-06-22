package com.way2automation.qa.pages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.qa.base.TestBase;

public class BrokenLinksPage extends TestBase {
	Boolean image;
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]")
	WebElement Validimage;
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]")
	WebElement Brokenimage;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]")
	WebElement Validlink;
	
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]")
	WebElement Brokenlink;
	
	
	public BrokenLinksPage() {
		PageFactory.initElements(driver,this);
	}
	
	//This will verify if the image is valid
	public void VerifyValidImage() {
		image=(Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", Validimage);
		
		if (image) {
	         System.out.println("Valid Logo present");
	      } else {
	         System.out.println("Valid Logo not present");
	      }
	}
	
	//This will verify if the image is broken
	public void VerifyBrokenImage() {
		
		if (Brokenimage.getAttribute("naturalWidth").equals("0")){
			System.out.println("Image is broken");
		}
		else {
			System.out.println("Image is not broken");
		}
	}
	
	 
	//This will verify the broken link on webpage
    public void VerifyBrokenLink() {
    	List<WebElement> links = driver.findElements(By.tagName("a"));
    
    	System.out.println("Total links are "+links.size());
    
    	for(int i=0; i<links.size(); i++) {
    	WebElement element = links.get(i);

    	String url=element.getAttribute("href");
    	
    	verifyLink(url);
    	}
    	}
    	
    	public static void verifyLink(String urlLink) {
    	       
    	        try {
    	
    	URL link = new URL(urlLink);
    	
    	HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
    	
    	httpConn.setConnectTimeout(2000);
    	
    	httpConn.connect();
    	
    	if(httpConn.getResponseCode()== 200) {
    	System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    	}
    	if(httpConn.getResponseCode()>= 400) {
    	System.out.println(urlLink+" - "+httpConn.getResponseMessage());
    	}
    	}
    
    	catch (Exception e) {
    	e.printStackTrace();
    	}
    	    }
    	
    	
    	
    }

