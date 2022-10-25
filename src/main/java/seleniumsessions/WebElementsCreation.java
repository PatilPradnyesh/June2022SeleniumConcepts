package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsCreation {
	 static WebDriver driver;

	public static void main(String[] args) {
		//the formulas is first create webelement and then perform actions(click,sendkeys,gettext,disct,isdisplayed)
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:\\www.google.com");
		driver.navigate().to("https:\\naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//creation of webelement
		//1)
		//driver.findElement(By.id("input-email")).sendKeys("Test@123");
		//findelements by id and pass send keys as input email
		//driver.findElement(By.id("input-password")).sendKeys("Test");
		
		//2)storing and creating element and then perform action
		//WebElement email = driver.findElement(By.id("input-email"));
		//WebElement pass = driver.findElement(By.id("input-password"));
		
		//email.sendKeys("Test@123");
		//pass.sendKeys("Test");
		
		//3)By locator
		//By email = By.id("input-email");
		//By pass = By.id("input-password");
		
		//WebElement emailId = driver.findElement(email);
		//WebElement passWord = driver.findElement(pass);
		
		//emailId.sendKeys("Test@123");
		//passWord.sendKeys("Test");
		
		//4)By locator with generic function
		//By email = By.id("input-email");
		//By pass = By.id("input-password");
		
		//getElement(email).sendKeys("Test@123");
		//getElement(pass).sendKeys("Test");
		
		//5)By Locator + doSendKeys + getElement
		//By email = By.id("input-email");
		//By pass = By.id("input-password");
		
		//doSendKeys(email, "Test@123");
		//doSendKeys(pass, "Test");
		
		//6)By locator +element util +generic function
		By email = By.id("input-email");
		By pass = By.id("input-password");
		
		ElementsUtil ele = new ElementsUtil(driver);
		ele.doSendKeys(email, "Test@123");
		ele.doSendKeys(pass, "Test");
		
		//7)by locators +br util and element util
		

	}
	public static void doSendKeys(By locator,String key ) {
		 getElement(locator).sendKeys(key);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
