package com.way2automation.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.testdata.ExcelReaderClass;
import com.way2automation.qa.util.TestUtil;

public class FormsPage extends TestBase {
	
	
	
	Select select;
	
	@FindBy(xpath="//*[@id=\"firstName\"]")
	WebElement FirstNameElement;
	
	
	@FindBy(xpath="//*[@id=\"lastName\"]")
	WebElement LastNameElement;
	
	
	@FindBy(xpath="//*[@id=\"userEmail\"]")
	WebElement EmailElement;
	
	
	@FindBy(xpath="//*[@id=\"gender-radio-1\"]")
	WebElement MaleRadiobutton;
	
		
	@FindBy(xpath="//*[@id=\"gender-radio-2\"]")
	WebElement FemaleRadiobutton;
	
	
	@FindBy(xpath="	//*[@id=\"gender-radio-3\"]")
	WebElement OtherRadiobutton;
		
	
	@FindBy(xpath="//*[@id=\"userNumber\"]")
	WebElement MobileNumberElement;
	
	
	@FindBy(xpath="//*[@id=\"subjectsContainer\"]")
	WebElement SubjectsElement;
	
	@FindBy(xpath="//*[@id=\"hobbies-checkbox-1\"]")
	WebElement SportsCheckBox;
	
	
	@FindBy(xpath="//*[@id=\"hobbies-checkbox-2\"]")
	WebElement ReadingCheckBox;
	
	@FindBy(xpath="//*[@id=\"hobbies-checkbox-3\"]")
	WebElement MusicCheckBox;
	

	@FindBy(xpath="	//*[@id=\"uploadPicture\"]")
	WebElement ChooseFileButton;
	

	
	@FindBy(xpath="//*[@id=\"uploadPicture\"]")
	WebElement UploadedFile;
	
	
	@FindBy(xpath="//*[@id=\"currentAddress\"]")
	WebElement CurrentAddressTextBox;
	
	
	@FindBy(xpath="//*[@id=\"state\"]/div/div[2]/div")
	WebElement StateDropdown;
	

	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement SubmitButton;
	
	
	
	
	public FormsPage(){
		PageFactory.initElements(driver,this);
	}
	
	
	public void Entername() {
		wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
      wait.until(ExpectedConditions.visibilityOf(FirstNameElement));
		FirstNameElement.sendKeys("Mukesh");
		
	}
	
	public void EnterLastName() {
		wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
	      wait.until(ExpectedConditions.visibilityOf(LastNameElement));
		LastNameElement.sendKeys("Virkhade");
	}
	
      public void EnterEmail() {
    	  
    	  wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
          wait.until(ExpectedConditions.visibilityOf(EmailElement));
		
		EmailElement.sendKeys("mukesh@gmsil.com");
	}
      
      public void SelectradioButton() {
    	  
    	  executor =(JavascriptExecutor)driver;
  		executor.executeScript("arguments[0].click();",MaleRadiobutton);
      }
      
      public void EnterSubjects() {
    	  wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
          wait.until(ExpectedConditions.visibilityOf(SubjectsElement));
    	  SubjectsElement.sendKeys("Math");
      }
	
	public void SelectHobbies() {
		executor =(JavascriptExecutor)driver;
  		executor.executeScript("arguments[0].click();",SportsCheckBox);
	}
	
	
	public void UploadFile() {
		executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",ChooseFileButton);
		
		ChooseFileButton.sendKeys("C:\\Users\\Lenovo\\eclipse-worksp\\Way2AutomationTest\\src\\main\\java\\com\\way2automation\\qa\\util\\sampleFile.jpeg");
			
	}
	

	public void EnterCurrentAddress() {
		wait= new WebDriverWait(driver,TestUtil.EXPLICIT_WAIT);
        wait.until(ExpectedConditions.visibilityOf(CurrentAddressTextBox));
		CurrentAddressTextBox.sendKeys("Morchund");
	}
	
	public void SelectState() {
		
		select=new Select(StateDropdown);
		
		select.selectByIndex(2);
		
	}
	
	public void ClickOnSubmitButton() {
		
		executor =(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",SubmitButton);
	}
	

}
