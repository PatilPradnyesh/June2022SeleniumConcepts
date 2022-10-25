package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeScreen {
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//This method is used make visible all the elements present on page so that no error will come
		//maximize method generally used for fit to the screen and before launching url
		//driver.manage().window().fullscreen();//ctrl+shift+o for all imports
		
		driver.get("https:\\www.Amazon.com");
		//driver.manage().window().minimize();//no as such use cases
		
		

	}

}
