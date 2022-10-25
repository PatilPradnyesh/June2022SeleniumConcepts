package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart");
		
		//driver.findElement(By.name("search11")).sendKeys("macbook");
		//NoSuchElementException --when locator is incorrect using findelement method --in selenium
		//while creating element we get exception
		//ElementNotFoundException in java not in selenium
		
		System.out.println(driver.findElements(By.xpath("//footer//naveen")).size());
		//no exception --when locator is incorrect using findelements method -- selenium
		//return empty list -- zero
		
		List<WebElement> list = driver.findElements(By.name("search"));
		System.out.println(list.size());
		
		//1.
		if(list.size()==1) {
			System.out.println("single search ele is present on the page");
		}
		else {
			System.out.println("no search or multiple search present on the page");
		}
		
		//2.
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		if(flag) {
			System.out.println("search ele is present on the page");

		}
	}
	
	public static boolean isSingleElementPresnt(By locator) {
		List<WebElement> list = driver.findElements(locator);
		System.out.println(list.size());
		
		//1.
		if(list.size()==1) {
			System.out.println("single search ele is present on the page");
			return true;
		}
		else {
			System.out.println("no search or multiple search present on the page");
			return false;
		}
	}
		

	}


