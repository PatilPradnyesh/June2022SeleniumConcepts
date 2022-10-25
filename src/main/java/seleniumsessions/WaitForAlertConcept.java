package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlertConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// browser - ch

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.name("proceed")).click();
		
		//WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(5));
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		//System.out.println(alert.getText());
		//alert.accept();
		
	    System.out.println(getAlertTextWithWait(5));
	    acceptAlertWithWait(5);
		
	}
	public static Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertTextWithWait(int timeOut) {
		return waitForAlert(timeOut).getText();
	}
	
	public static void acceptAlertWithWait(int timeOut) {
		waitForAlert(timeOut).accept();
	}
	
	public static void dismissAlertWithWait(int timeOut) {
		waitForAlert(timeOut).dismiss();
	}
	
	public static void doSendKeysAlertWithWait(int timeOut, String value) {
		waitForAlert(timeOut).sendKeys(value);
	}
	
	
	

}
