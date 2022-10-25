package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/?tag=hymsabk-20&ref=pd_sl_6gwjrxu9p1_e&adgrpid=1341405838299434&hvadid=83838130693496&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149464&hvtargid=kwd-83838874655187:loc-90&hydadcr=28884_14580403");
		
		/*boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();

		if(flag) {
			System.out.println("Ele is displayed");
		}
		
		else {
			System.out.println("Ele is not displayed");
		}*/
		
		By searchTextBar = By.id("twotabsearchtextbox");
		
		if(doEleIsDisplayed(searchTextBar)) {
			System.out.println("Element is displayed");
			doSendKeys(searchTextBar, "MacBook");
		}
		else {
			System.out.println("Element is not displayed");
		}
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}
	
	public static boolean doEleIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator , String key) {
		driver.findElement(locator).sendKeys(key);
	}
	

}
