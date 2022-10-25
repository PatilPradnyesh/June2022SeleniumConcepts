package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		
		//Implicitly wait
		//1)Global wait
		//2)Applied for all element by default
		//3)Applied after driver declaration
		//4)Not Recommended
		//5)It does not support Non Webelements -- url, alerts, title
        //we never use implicit wait in framework
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Implicit wait declaration
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.name("firstname1"));
		firstName.sendKeys("Naveen");
		
		//loginpage -- 10sec 
		//e1 -- 2sec -- 10-2 -- 8sec cancelled
		//e2 -- 0 sec -- 10-0 -- 10 sec cancelled
		
		//this is impacting on performance of script
		
		//homepage -- 5sec -- to change wait to 5 again we have to override
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Nullify imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
		
		
	}

}
