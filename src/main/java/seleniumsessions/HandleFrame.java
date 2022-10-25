package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://www.londonfreelance.org/courses/frames/index.html");
	    
	    //driver.switchTo().frame(5);//this is not perfect beacuse in futute there might be addition of frame u can find index by searching tag name frame
	    //driver.switchTo().frame("bot");//By name or id
	    //driver.switchTo().frame(driver.findElement(By.name("bot")));//by webelement like by xpath any selector
	    
	    Thread.sleep(3000);
	    
	    String footer = driver.findElement(By.xpath("/html/body/h2")).getText();
	    System.out.println(footer);
		
		

	}

}
