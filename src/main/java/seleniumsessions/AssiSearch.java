package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssiSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		////div[@class='ac_results']//li --- div -tag name before that 2 forward slash
		//[]any attribute in sq. bracket respressent by @attr name = attr value 
		// then slash depend on direct indirect association 
		//li tag name
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		/*driver.findElement(By.id("search_query_top")).sendKeys("Dresses");
		Thread.sleep(10000);
		
		List <WebElement> suggList = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
		for(WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("casual Dresses > Printed Dress")) {
				e.click();
				break;
			}
		}
		
		WebElement heading = driver.findElement(By.tagName("h1"));
		String text = heading.getText();
		if(text.equals("Printed Dress")) {
			System.out.println("Heading is correct");
		}
		else {
			System.out.println("Heading is Incorrect");
		}*/
		
		By searchLocator = By.id("search_query_top");
		By suggLocator = By.xpath("//div[@class='ac_results']//li");
		By locatorText = By.tagName("h1");
		
		search(searchLocator, "Dresses", suggLocator, "Casual dresses > printed dress");
		
		if(doGetText(locatorText).equals("Printed Dress")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("fail");
		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void search(By searchLocator, String searchValue, By suggLocator, String suggValue) throws InterruptedException {
		getElement(searchLocator).sendKeys(searchValue);
		Thread.sleep(10000);
		
		List<WebElement> optionList = getElements(suggLocator);
		
		for(WebElement e: optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(suggValue)) {
				e.click();
				break;
			}
		}
		
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	

}
