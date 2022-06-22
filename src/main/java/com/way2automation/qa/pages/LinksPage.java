package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.way2automation.qa.base.TestBase;

public class LinksPage extends TestBase{
	
	String CreatedResponse;
	String NocontentResponse;
	String MovedResponse;
	String BadRequestResponse;
	String UnauthorizedResponse;
	String ForbiddenResponse;
	String NotFoundResponse;
	
	
	
	@FindBy(xpath="//*[@id=\"simpleLink\"]")
	WebElement HomeLink;	
	
	
	
	@FindBy(xpath="//*[@id=\"dynamicLink\"]")
	WebElement Home19v3Link;
	
	
	
	@FindBy(xpath="//*[@id=\"created\"]")
	WebElement CreatedLink;
	
	//*[@id="no-content"]
	
	@FindBy(xpath="//*[@id=\"no-content\"]")
	WebElement NoContentLink;
	
	
	@FindBy(xpath="//*[@id=\"moved\"]")
	WebElement MovedLink;
	

	@FindBy(xpath="//*[@id=\"bad-request\"]")
	WebElement BadRequestLink;
	
	@FindBy(xpath="//*[@id=\"unauthorized\"]")
	WebElement UnAuthorizedLink;
	
	
	@FindBy(xpath="//*[@id=\"forbidden\"]")
	WebElement ForbiddenLink;
	
	
	
	@FindBy(xpath="//*[@id=\"invalid-url\"]")
	WebElement NotFoundLink;
	
	
	//Response
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement CreateLinkResponse;
	
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement NoContentLinkResponse;
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement MovedLinkResponse;
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement BadRequestLinkResponse;
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement UnauthorizedLinkResponse;
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement ForbiddenLinkResponse;
	
	@FindBy(xpath="//*[@id=\"linkResponse\"]")
	WebElement NotFoundLinkResponse;
	
	
    public LinksPage() {
		
		PageFactory.initElements(driver,this);
	}

    
    public void ClickOnHomeLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",HomeLink);
    }
    
    public void ClickOnHome19v3Link() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",Home19v3Link);
    }
    
    public void ClickOnCreatedLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",CreatedLink);
    	
    	CreatedResponse=CreateLinkResponse.getText();
    	
    	Assert.assertEquals(CreatedResponse, prop.getProperty("CreatedLinkResponseExpected"));
    }
    
    public void ClickOnNoContentLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",NoContentLink);
    	
    	NocontentResponse=NoContentLinkResponse.getText();
    	
    	Assert.assertEquals(NocontentResponse, prop.getProperty("NoContentLinkResponseExpected"));
    }

    public void ClickOnMovedLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",MovedLink);
    	MovedResponse=MovedLinkResponse.getText();
    	
    	Assert.assertEquals(MovedResponse, prop.getProperty("MovedLinkResponseExpected"));
    }
    
    
    public void ClickBadRequestLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",BadRequestLink);
    	BadRequestResponse=BadRequestLinkResponse.getText();
    	
    	Assert.assertEquals(BadRequestResponse, prop.getProperty("BadRequestLinkResponseExpected"));
    }
    
    

    public void ClickUnauthorizedLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",UnAuthorizedLink);
    	
    	UnauthorizedResponse=UnauthorizedLinkResponse.getText();
    	Assert.assertEquals(UnauthorizedResponse, prop.getProperty("UnauthorizedLinkResponseExpected"));
    }
    
    public void ClickForbiddenLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",ForbiddenLink);
    	ForbiddenResponse=ForbiddenLinkResponse.getText();
    	Assert.assertEquals(ForbiddenResponse, prop.getProperty("ForbiddenLinkResponseExpected"));
    }

    
    public void ClickOnNotFoundLink() {
    	executor =(JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();",NotFoundLink);
    	NotFoundResponse=NotFoundLinkResponse.getText();
    	Assert.assertEquals(NotFoundResponse, prop.getProperty("NotFoundLinkResponseExpected"));
    }
}
