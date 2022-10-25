package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
    static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		//Select html tag mandatory
		//Select class in selenium
		//Select select = new Select(parameter); parameter=webelement
		//sendkeys also work when select is there
		
		//WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
		//Select select = new Select(country);
		//country.sendKeys("India");
		
		//select.selectByIndex(12);//first method to select by index
		
		//select.selectByVisibleText("India");//no spelling mistake//second method to select by visble text
		
		//select.selectByValue("Pakistan");//third method//value attribute must be there 
		
		By country = By.id("Form_getForm_Country");
		
		//doSelectDropDownByIndex(country, 3);//starts from 0
		//doSelectDropDownByVisibleText(country, "India");//always preferred
		doSelectDropDownByValue(country, "Pakistan");
		
		System.out.println(getDropDownOptionsCount(country)-1);
		//System.out.println(getDropDownOptions(country));
		System.out.println(getDropDownOptionsText(country));
	}
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getDropDownOptionsCount(By locator) {
		return getDropDownOptions(locator).size();
	}
	
	public static ArrayList <String> getDropDownOptionsText(By locator){
		List <WebElement> dropDownOptionsList = getDropDownOptions(locator);
		ArrayList <String> dropDownOptionsListText = new ArrayList<String>();
		
		for(WebElement e : dropDownOptionsList) {
			String text = e.getText();
			dropDownOptionsListText.add(text);
		}
		return dropDownOptionsListText;
	}

}
