package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentId = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW); //New window
		//driver.switchTo().newWindow(WindowType.TAB);//New Tab
		
		driver.navigate().to("https://google.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		

	}

}
