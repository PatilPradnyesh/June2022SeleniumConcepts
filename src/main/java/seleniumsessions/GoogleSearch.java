package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//WebElement searchVal = driver.findElement(By.name("q"));
		
		
		//searchVal.sendKeys("Selenium");
		//Thread.sleep(3000);
		
		//List <WebElement> suggestionList = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
		//System.out.println(suggestionList.size()-1);
		
		//for(WebElement e: suggestionList) {
		//	String text = e.getText();
		//	System.out.println(text);
		//	if(text.equals("selenium download")) {
		//		e.click();
		//		break;
		//	}
		//}
		
		By searchLocator = By.name("q");
		By suggLocator = By.xpath("//div[@class='wM6W7d']/span");
		
		googleSearch(searchLocator, "Selenium", suggLocator, "selenium download");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static void googleSearch(By searchLocator, String searchValue, By suggLocator, String suggValue ) throws InterruptedException {
		getElement(searchLocator).sendKeys(searchValue);
		Thread.sleep(3000);
		
		List <WebElement> suggestionList = getElements(suggLocator);
		System.out.println(suggestionList.size()-1);
		
		for(WebElement e: suggestionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(suggValue)) {
				e.click();
				break;
			}
		}
	}

}
