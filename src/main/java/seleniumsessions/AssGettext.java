package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssGettext {

	public static void main(String[] args) throws Exception {
		
		BrowserUtil brOne = new BrowserUtil();
		WebDriver driver = brOne.launchBrowser("chrome");
		driver.manage().window().maximize();
		brOne.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By contiBtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		//By alertMessage =By.xpath("//*[@id=\"account-register\"]/div[1]");
		By alertMessage =By.className("alert-danger");
		By fistName = By.xpath("//*[@id=\"account\"]/div[2]/div/div");
		By lastName = By.xpath("//*[@id=\"account\"]/div[3]/div/div");
		By email = By.xpath("//*[@id=\"account\"]/div[4]/div/div");
		
		ElementsUtil eleOne = new ElementsUtil(driver);
		eleOne.doClick(contiBtn);
		
		String messagAlert = eleOne.doGetText(alertMessage);
		String messagefirstName = eleOne.doGetText(fistName);
		String messageLastName = eleOne.doGetText(lastName);
		String messageemail = eleOne.doGetText(email);
		
		
		
		
		
		System.out.println(messagAlert);
		System.out.println(messagefirstName);
		System.out.println(messageLastName);
		System.out.println(messageemail);
		
		
		
	}

}
