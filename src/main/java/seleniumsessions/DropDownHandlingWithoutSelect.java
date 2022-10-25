package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlingWithoutSelect {
    static WebDriver driver;
	
	public static void main(String[] args) {
		//without select class and sendkeys handle dropdown
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//create xpath - //select/option - starts with 2 forward slash and then tag name then 1 for ward slash as option is direct associated with select
		
		//List <WebElement> optionList = driver.findElements(By.xpath("//select/option"));
		
		//Syso(optionList.size());
	
		//for(WebElement e : optionList) {
		//	String text = e.getText();
		//	System.out.println(text);
		//	if(text.equals("India")) {
		//		e.click();
		//		break;
		//	}
		//}
		
		By country = By.xpath("//select/option");
		
		doSelectDropDownWithoutSelectClass(country, "Pakistan");

	}
	public static void doSelectDropDownWithoutSelectClass(By locator, String value) {
		List <WebElement> optionsList = getElements(locator);
		
		System.out.println(optionsList.size());
		
		for(WebElement e: optionsList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}
	
	public static List<WebElement> getElements (By locator){
		return driver.findElements(locator);
	}

}
