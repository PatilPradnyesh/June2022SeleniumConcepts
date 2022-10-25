package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	
	static WebDriver driver; 

	public static void main(String[] args) {
		
		//textfield asli ani value capture karaychi asi tr  get attribute method use hote
		//placeholder mhanje grey colour madhe adhich asleli text
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//WebElement firstName = driver.findElement(By.id("input-firstname"));
		//firstName.sendKeys("Shubham");
		//String text = firstName.getAttribute("value");
		
		//String text2 =driver.findElement(By.linkText("Contact Us")).getAttribute("href");
		
		//System.out.println(text);
		//System.out.println(text2);

		By logoImg = By.className("img-responsive");
		By wishListTab = By.linkText("Wish List");
		
		String text1 = doGetAttribute(logoImg, "src");
		String text2 = doGetAttribute(logoImg, "title");
		String text3 = doGetAttribute(wishListTab, "href");
		
		
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetAttribute(By locator, String attrValue) {
		return getElement(locator).getAttribute(attrValue);
	}

}
