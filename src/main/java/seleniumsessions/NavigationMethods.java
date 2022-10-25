package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		//driver.navigate.to and driver.get both marhods are exact same both are synonym
		//.to method is calling driver.get method only
		//difference is between navigate and get method we can do back and forward with to method
		//use case of to is when we have to launch external website from one website then we use ex google to amazon 
		//to method is overloaded
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.navigate().to("https:\\www.google.com");
		driver.get("https:\\www.google.com");
		
		System.out.println(driver.getTitle());
		
		//driver.get("https:\\www.Amazon.com");
		driver.navigate().to("https:\\www.Amazon.com");
		//driver.navigate().to(new URL("https:\\www.Amazon.com"));
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		

	}

}
