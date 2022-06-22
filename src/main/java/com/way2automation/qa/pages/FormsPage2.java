package com.way2automation.qa.pages;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.util.TestUtil;

public class FormsPage2 extends TestBase{

	

	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement FirstNameElement;

	
	public FormsPage2(){
		PageFactory.initElements(driver,this);
	}
	
	

	public void Entername() throws InterruptedException {
		
		wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
   	   wait.until(ExpectedConditions.elementToBeClickable(FirstNameElement));
   	   FirstNameElement.sendKeys("Mukesh");
		
	}
	
	/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L))
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return FirstNameElement;
		     }
		   });
		   
		   FirstNameElement.sendKeys("Mukesh");
	}
	*/
		
		/*((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView(true);",FirstNameElement);
		 Thread.sleep(5000);
		FirstNameElement.sendKeys("Mukesh");
		
		*/
	
	
	//===========================
	
	}
		
	
