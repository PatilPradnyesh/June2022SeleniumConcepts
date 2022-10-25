package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart");
		
		/*List<WebElement>footerLinkList = driver.findElements(By.xpath("//footer//a"));
		System.out.println(footerLinkList.size());
		
		ArrayList <String> footerLinksList = new ArrayList<String>();
		
		for(WebElement e : footerLinkList) {
			String text = e.getText();
			footerLinksList.add(text);
		}
		System.out.println(footerLinksList);*/
		By footer = By.xpath("//footer//a");//both tag name a is indirect associated with footer
		
		System.out.println(getFooterLinksList(footer));
		
		if(getFooterLinksList(footer).contains("About Us")) {
			System.out.println("Pass");
		}

	}
	public static ArrayList<String> getFooterLinksList(By locator){
		List<WebElement>footerLinkList = driver.findElements(locator);
		System.out.println("Size of Footer is : " +footerLinkList.size());
		
		ArrayList <String> footerLinksList = new ArrayList<String>();
		
		for(WebElement e : footerLinkList) {
			String text = e.getText();
			footerLinksList.add(text);
		}
		return footerLinksList;
	}

}
