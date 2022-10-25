package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		
		//we can do one hack pass Uname and Pass with url
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String uName ="admin";
		String passW ="admin";
		
		driver.get("http://"+uName+":"+passW+"@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.xpath("//div//p")).getText();
		System.out.println(text);
	}

}
