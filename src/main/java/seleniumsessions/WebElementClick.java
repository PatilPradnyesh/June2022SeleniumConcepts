package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login?hubs_signup");
		
		//driver.findElement(By.id("username")).sendKeys("Shubham@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("Shubham123");
		//driver.findElement(By.id("loginBtn")).click();
		
		By username = By.id("username");
		By password = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		doSendKeys(username, "Shubham@gmail.com");
		doSendKeys(password, "Shubham123");
		doClick(loginBtn);
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String key) {
		getElement(locator).sendKeys(key);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
