package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerWithAllWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");//Parent window
		Thread.sleep(4000);
		
		String parentWindowId = driver.getWindowHandle();//Store parent window id
		
		//clicking on all elements from parent window
		
		driver.findElement(By.xpath("(//div[@class = 'orangehrm-login-footer-sm']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class = 'orangehrm-login-footer-sm']/a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class = 'orangehrm-login-footer-sm']/a)[3]")).click();
		driver.findElement(By.xpath("(//div[@class = 'orangehrm-login-footer-sm']/a)[4]")).click();
		
		//we get id's by getWindowHandles() and store in Set<String>
		
		Set <String> handles = driver.getWindowHandles();
		
		//iterator is used to get orderless collection and store it in Iterator<String>
		Iterator <String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();//for getting all window id
			driver.switchTo().window(windowId);//for switching to windows
			String title = driver.getTitle();//for window title
			System.out.println(title);
			Thread.sleep(2000);
			if(!windowId.equals(parentWindowId)) {
				driver.close();//this condn is for ignoring parent window for closing
			}
		}
		
		driver.switchTo().window(parentWindowId);
		String parentWindowTitle = driver.getTitle();
        System.out.println(parentWindowTitle);
        driver.quit();
	}

}
