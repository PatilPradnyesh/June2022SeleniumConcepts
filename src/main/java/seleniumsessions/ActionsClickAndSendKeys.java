package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
    static WebDriver driver;
	public static void main(String[] args) {
		//This we can use instead of simple one click and sendkeys when ele is not visible bacause of overlapping on page
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        Actions act = new Actions(driver);
        
        WebElement sendKeysEle = driver.findElement(By.id("input-firstname"));
        WebElement clickEle = driver.findElement(By.name("agree"));
        
        act.sendKeys(sendKeysEle, "Shubham").build().perform();
        
        act.click(clickEle).build().perform();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
    public static void doActionsSendKeys(By sendKeysEleLocator, String key) {
        Actions act = new Actions(driver);
        act.sendKeys(getElement(sendKeysEleLocator), key).build().perform();
    }
    
    public static void doActionsClick(By clicEleLocator) {
        Actions act = new Actions(driver);
        act.click(getElement(clicEleLocator)).build().perform();
    }
}
