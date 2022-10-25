package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesWithApproach2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");//Parent window
		Thread.sleep(4000);
		
		String parentWindowId = driver.getWindowHandle();
		
		for(int i=1;i<=4;i++) {
		
		driver.findElement(By.xpath("(//div[@class = 'orangehrm-login-footer-sm']/a)["+i+"]")).click();
		
		Set <String> handle = driver.getWindowHandles();
		Iterator <String> it = handle.iterator();
		it.next();
		String childWindow = it.next(); 
		System.out.println("Child Window Id : "+childWindow);
		
		//Switching
		Thread.sleep(2000);
		driver.switchTo().window(childWindow);
		System.out.println("Child Window Title : "+ driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title : "+ driver.getTitle());
		System.out.println("                                     ");
		}
		
		driver.quit();

	}

}
