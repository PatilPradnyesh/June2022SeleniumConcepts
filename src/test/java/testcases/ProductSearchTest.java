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

public class ProductSearchTest {

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
	public Object [] [] getSearchData() {
		return new Object[] [] {
			{"iMac"},
			{"samsung"},
			{"Macbook"}
		};
	}
	
	@Test(dataProvider="getSearchData")
	public void doProductSearchTest(String productName) {
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys(productName);
		
		driver.findElement(By.cssSelector("div#search button")).click();
		
		int productCount = driver.findElements(By.cssSelector("div.product-layout.product-grid.col-lg-3.col-md-3.col-sm-6.col-xs-12")).size();
		Assert.assertTrue(productCount>0);
	}
	
	@AfterTest
	public void tearDown() {
		//driver.quit();
	}
}
