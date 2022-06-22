package com.way2automation.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;

import com.way2automation.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static  WebDriverWait wait;
	public static JavascriptExecutor executor;
	public static Actions act;
	public static Assertion softassert;
	
	//Below constructor has properties file loading part 
	public TestBase() {
		
		try {
			prop= new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-worksp\\Way2AutomationTest\\src\\main\\java\\com\\way2automation\\qa\\config\\config.properties");
			prop.load(fis);	
			}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
			}
		
		catch (IOException e) {
			e.printStackTrace();
		}	
		}
	
	// this method will read the properties file
	
	public static void intialization() {
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		
		    driver= new ChromeDriver();
			
			
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver= new FirefoxDriver();
		
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// ===========time durations  we are using from testutil class========
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));		
	   	driver.get(prop.getProperty("url"));
	   	
	   	
	}	

}
