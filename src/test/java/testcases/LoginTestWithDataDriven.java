package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestWithDataDriven {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@DataProvider
	public Object [] [] getNegativeLoginTestData() {
		return new Object[] [] {
			{"testwert@gmail.com", "test!!!2233"},
			{"naveenanimation20@gmail.com", "@#@#@#"},
			{"    ", "test@123"},
			{"test@gmail.@.com", "test@121212"},
			{"    ", ""}
		};
	}
	
	@Test(dataProvider = "getNegativeLoginTestData")
	public void loginNegativeTest(String userName, String passWord) {
		Assert.assertTrue(doLogin(userName, passWord));
	}
	
	public Boolean doLogin(String userName, String passWord) {
	    driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(passWord);
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		return driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).isDisplayed();
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
