package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set <String> handles = driver.getWindowHandles();
		
		Iterator <String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("Parent window id : "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id : " +childWindowId);
		
		//Switching
		driver.switchTo().window(childWindowId);
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		
		driver.findElement(By.name("first_name")).sendKeys("Naveen");
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		driver.quit();

	}

}
