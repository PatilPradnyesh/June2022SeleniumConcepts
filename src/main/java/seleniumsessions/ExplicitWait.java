package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
    static WebDriver driver;
	public static void main(String[] args) {
		
		//Explicit Wait
		//1)It is applied on specific element not on all elemnet
		//2)It is not global wait
		//3)It supports non WebElements -- url, Alert's, title
		//4)polling/interval
		
		//1)WebDriverWait
		//2)FluentWait

		//WebDriverWait(C)--extends--FluentWait(C)--Implements--Wait(I)----until();
		
		//FluentWait(C) -- until() -- @override + other methods
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By emailId = By.id("input-email");
		By logo = By.cssSelector("img.img-responsive");
		By pwd = By.id("input-password");
		
		//Explicit wait
		//Also another way of creating WebElement
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//WebElement emailEle = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
		//emailEle.sendKeys("Naveen@gmail.com");
		
		//WebElement pwdELe = driver.findElement(pwd);
		//pwdELe.sendKeys("Shubhame");
		
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		//WebElement logoEle = wait1.until(ExpectedConditions.presenceOfElementLocated(logo));
		//if(logoEle.isDisplayed()) {
			//System.out.println("Pass");
		//}
		
		waitForElementPresence(emailId,10).sendKeys("Naveen@123");
		getElement(pwd).sendKeys("Shubham");
		Boolean flag =waitForElementPresence(logo,5).isDisplayed();
		System.out.println(flag);
		
		
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does notnecessarily mean that the element is visible.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
