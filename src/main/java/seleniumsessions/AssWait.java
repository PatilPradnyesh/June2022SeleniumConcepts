package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementsUtil eleUtil = new ElementsUtil(driver);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By telePhone = By.id("input-telephone");
		By passWord = By.id("input-password");
		By confPwd = By.id("input-confirm");
		By checkBox = By.name("agree");
		By continu = By.cssSelector("input.btn.btn-primary");
		By confMessage = By.xpath("//div[@id='content']/h1");
		
		eleUtil.doSendKeysWithWait(firstName, 10, "Naveen");
		eleUtil.doSendKeys(lastName, "Khunteta");
		eleUtil.doSendKeys(email, "Naveenhuntea@gmail.com");
		eleUtil.doSendKeys(telePhone, "654767436456");
		eleUtil.doSendKeysWithWait(passWord, 10, "Naveen123");
		eleUtil.doSendKeys(confPwd, "Naveen123");
		eleUtil.doClick(checkBox);
		eleUtil.doClick(continu);
		
		String message = eleUtil.getElementTextWithWait(confMessage, 10);
		System.out.println(message);

	}

}
