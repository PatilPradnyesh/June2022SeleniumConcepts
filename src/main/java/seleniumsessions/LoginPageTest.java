package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver=brUtil.launchBrowser("chrome");
		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email = By.id("input-email");
		By pass = By.id("input-password");
		
		ElementsUtil elUtil =new ElementsUtil(driver);
		
		elUtil.doSendKeys(email, "Test@123");
		elUtil.doSendKeys(pass, "Test");
		
		
		

	}

}
