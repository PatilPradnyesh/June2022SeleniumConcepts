package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssDataDriven {

WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	@DataProvider
	public Object [] [] getPositiveRegisterData() {
		return new Object[][] {
			{"Shubham","Patil","Shubh@gmail.com","4545534535","Shubham123"},
			{"Mahesh","Patil","Mahe@gmail.com","4545534536","Mahesh123"},
			{"Jayesh","Patil","Jaye@gmail.com","4545534537","Jayesh123"},
		};
	}
	
	@Test (dataProvider = "getPositiveRegisterData")
	public void registerAccountTest(String firstName, String lastName, String emailId, String telePhone, String passWord) {
		Assert.assertTrue(doRegisterAccount(firstName, lastName, emailId, telePhone, passWord));
	}
	
	
	
	public Boolean doRegisterAccount(String firstName, String lastName, String emailId, String telePhone, String passWord) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(emailId);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(telePhone);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(passWord);
		
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys(passWord);
		
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		WebElement message = driver.findElement(By.cssSelector("div#content h1"));
		if(message.getText().contains("Your Account Has Been Created!")) {
			return true;
		}
		else {
			return false;
			}
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
}
