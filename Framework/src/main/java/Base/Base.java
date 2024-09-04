package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Base {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void Browser() {
		
		 // Setup WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Navigate to the login page
        
        //this is login
        
		
	}
	
	
	@DataProvider(name="Login")
	public void login() {
	
		
		
		
	}
	
	@BeforeMethod
    public void setup() {
		driver.get("");
		
		
		
       
    }
	
	
	
	@AfterSuite
	public void quitbrowser()
	{
		
		driver.quit();
		
	}

	
}
