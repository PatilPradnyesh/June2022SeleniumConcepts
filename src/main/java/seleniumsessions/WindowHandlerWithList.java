package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerWithList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		Set <String> handles = driver.getWindowHandles();
		
		//Convert set into List
		List <String> handlesList = new ArrayList<String>(handles);
		String parentWindowId = handlesList.get(0);
        System.out.println("Parent Window Id : "+parentWindowId);
		String childWindowId = handlesList.get(1);
		System.out.println("Child Window Id : "+childWindowId);
		
		// switching
				driver.switchTo().window(childWindowId);
				Thread.sleep(2000);
				System.out.println("child window title : " + driver.getTitle());
				driver.findElement(By.name("first_name")).sendKeys("naveen");
				// close child window:
				driver.close();

				driver.switchTo().window(parentWindowId);
				System.out.println("parent window title : " + driver.getTitle());

				driver.quit();
	}

}
