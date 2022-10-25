package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2 {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver =brUtil.launchBrowser("chrome");
		driver.manage().window().maximize();
		
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getPageTitle());
		
		
		By login = By.linkText("Login");
		By register = By.linkText("Register");
		By ForgotPassword = By.linkText("Forgotten Password");
		By myAccount = By.linkText("My Account");
		By addrBook = By.linkText("Address Book");
		By wishList = By.linkText("Wish List");
		By orderHistry = By.linkText("Order History");
		By downLoad = By.linkText("Downloads");
		By recPayments = By.linkText("Recurring payments");
		By rewPoints = By.linkText("Reward Points");
		By returns = By.linkText("Returns");
		By trans = By.linkText("Transactions");
		By newslett = By.linkText("Newsletter");
		
		ElementsUtil elUtil = new ElementsUtil(driver);
		
		elUtil.doClick(login);
		
		elUtil.doClick(register);
		driver.navigate().back();
		
		elUtil.doClick(ForgotPassword);
		driver.navigate().back();
		
		elUtil.doClick(myAccount);
		driver.navigate().back();
		
		elUtil.doClick(addrBook);
		driver.navigate().back();
		
		elUtil.doClick(wishList);
		driver.navigate().back();
		
		elUtil.doClick(orderHistry);
		driver.navigate().back();
		
		elUtil.doClick(downLoad);
		driver.navigate().back();
		
		elUtil.doClick(recPayments);
		driver.navigate().back();
		
		elUtil.doClick(rewPoints);
		driver.navigate().back();
		
		elUtil.doClick(returns);
		driver.navigate().back();
		
		elUtil.doClick(trans);
		driver.navigate().back();
		
		elUtil.doClick(newslett);
		driver.navigate().back();
		
		

	}

}
