package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		//to overcome the error due to browser upgrade webdrivermanger concept came into picture
		
		WebDriverManager.chromedriver().setup();//we have to use this line instead of systemsetproperty
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https:\\www.google.com");
		
		driver.close();

	}

}
