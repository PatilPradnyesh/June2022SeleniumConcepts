package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssigmentWebElementsSendkeys {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil brUtil =new BrowserUtil();
		
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println(brUtil.getPageTitle());
		System.out.println(brUtil.getPageUrl());
		
		By fistName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By passWord = By.id("input-password");
		By confirmPass = By.id("input-confirm");
		
		
		ElementsUtil eleUtil = new ElementsUtil (driver);
		
		eleUtil.doSendKeys(fistName, "Shubham");
		eleUtil.doSendKeys(lastName, "Patil");
		eleUtil.doSendKeys(email, "Shubham@123");
		eleUtil.doSendKeys(telePhone, "12345566");
		eleUtil.doSendKeys(passWord, "Shubham123");
		eleUtil.doSendKeys(confirmPass, "Shubham123");
		
		//brUtil.quitBrowser();
		
		

	}

}
