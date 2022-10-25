package seleniumsessions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window

		By ytLink = By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]");
		
		ElementsUtil eleUtil = new ElementsUtil(driver);
		eleUtil.doClickWithWaitForVisibleEle(ytLink, 10);
		
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//if(wait.until(ExpectedConditions.urlContains("OrangeHRMInc"))) {
			//System.out.println(driver.getCurrentUrl());
		//}
		if(wait.until(ExpectedConditions.urlToBe("https://www.youtube.com/c/OrangeHRMInc"))) {
			System.out.println(driver.getCurrentUrl());
		}
	}
	public static String waitForUrlContains(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}
	
	public static String waitForUrlIs(int timeOut, String urlFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlFraction))) {
			return driver.getCurrentUrl();
		}
		else {
			return null;
		}
	}
	 

}
