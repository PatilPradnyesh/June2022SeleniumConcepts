package seleniumsessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsSectionLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By textField = By.className("col-sm-2");
		By rightSectionLinks = By.className("list-group-item");
		
		ElementsUtil eleUtil = new ElementsUtil(driver);
		System.out.println(eleUtil.getElementsCount(textField));
		ArrayList textFieldList = eleUtil.getElementsTextList(textField);
		System.out.println(textFieldList);
		
		System.out.println(eleUtil.getElementsCount(rightSectionLinks));
		ArrayList rightText = eleUtil.getElementsTextList(rightSectionLinks);
		System.out.println(rightText);

	}

}
