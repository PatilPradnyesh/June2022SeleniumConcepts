package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		// there 8 locators in selenium

		// 1)id - unique - it's an attribute (I st preferred among class , name , id)
		// driver.findElement(By.id("input-password")).sendKeys("naveen123");

		// 2)name - can be duplicate - it's an attribute (II nd preferred among class
		// name id)
		// driver.findElement(By.name("password")).sendKeys("naveen123");

		// 3)ClassName - most risky - mostly duplicate - it's an attribute (III rd
		// preferred)
		// driver.findElement(By.className("form-control")).sendKeys("naveen@123");
		//class is separeted by space ex"alert alert-one" in this 2 class are there and we can use one classname otherwise exception invalid selector

		// 4)linktext - only for links - html tag <a> is mandatory (anchor tag)- text is
		// after the link
		// driver.findElement(By.linkText("Desktops")).click();

		// 5)partiallinktext - it is similar to 4 just difference is need to pass
		// partial text
		// but problem is that possibility that two elemnts start with same text
		// 4 is preferred over 5
		// driver.findElement(By.partialLinkText("Des")).click();

		// 6)Xpath - not an attribute - address of web element on page dom - right click
		// and copy xpath - use xpath only
		// driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[6]")).click();

		// 7)css - not an attribute - address of web element on page dom - right click
		// and copy selector
		// driver.findElement(By.cssSelector("#input-email")).sendKeys("shubham");

		// 8)tagname - not an attribute - by html tag
		// String header =driver.findElement(By.tagName("h1")).getText();
		// System.out.println(header);
		//
		By header = By.tagName("h1");
		By deskstop = By.linkText("Desktops");
		By pass = By.xpath("//*[@id=\"content\"]/form/fieldset[2]/legend");
		
		By continueBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		String actHeader =doGetText(header);
		
		if(actHeader.equals("Register Account")) {
			System.out.println("Correct header");
		}
		else {
			System.out.println("Incorrect header");
		}
		//
		String desktop = doGetText(deskstop);
		System.out.println(desktop);
		//
		String passW = doGetText(pass);
		System.out.println(passW);
		//
		//By using ctrl + f we can open search bar for locators
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); 
	}
	
	public static void doClick(By locator) {
		driver.findElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}

}
