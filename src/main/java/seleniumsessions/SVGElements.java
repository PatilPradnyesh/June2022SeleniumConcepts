package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		//svg element can be handle with speacial xpath
		//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @class='state']
		//name() child svg
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://petdiseasealerts.org/forecast-map#/");
		
		Thread.sleep(4000);
		
		List <WebElement> statesList = driver.findElements(By.xpath("//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @class='state']"));
		
		for(WebElement e:statesList) {
			System.out.println(e.getAttribute("id"));
			
		}*/
		
		//ass go to flipkart type productname and click on svg element
		
		//button[@class='L0Z3Pu']//*[local-name()='svg']
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("MacBook");
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']//*[local-name()='svg']")).click();
		

	}

}
