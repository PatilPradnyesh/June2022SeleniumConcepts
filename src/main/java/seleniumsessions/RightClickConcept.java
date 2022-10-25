package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
        
      /*  Actions act = new Actions(driver);
        
        WebElement rightClickEle = driver.findElement(By.xpath("//span[contains(@class,'context-menu-one')]"));
        
        act.contextClick(rightClickEle).build().perform();
        
        List<WebElement>options = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]/li/span"));

        for(WebElement e:options) {
        	String text = e.getText();
        	System.out.println(text);
        }*/
        
      By xpath =  By.xpath("//span[contains(@class,'context-menu-one')]");
      doActionsRightClick(xpath);
      
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsRightClick(By locator) {
		 Actions act = new Actions(driver);
	     WebElement rightClickEle = getElement(locator);   
	     act.contextClick(rightClickEle).build().perform();
	}
	

}
