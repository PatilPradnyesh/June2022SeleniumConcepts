package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Create Base element
		//then right,left,near,above,below
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://aqi.in/dashboard/canada");
		
		WebElement ele = driver.findElement(By.linkText("Cranbrook, Canada"));
		
		//for right//This is only applicable for single element
		String rightValue = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightValue);
		
		List <WebElement> rightValueList = driver.findElements(with(By.tagName("p")).toRightOf(ele));
		for(WebElement e : rightValueList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		System.out.println("____________");
		
		//for left//This is only applicable for single element
		String leftValue = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftValue);
		
		List <WebElement> leftValueList = driver.findElements(with(By.tagName("p")).toLeftOf(ele));
		for(WebElement e : leftValueList) {
			String text = e.getText();
			System.out.println(text);
		}
		
		System.out.println("____________");
		
		//for above//This is only applicable for single element
		String aboveValue = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveValue);
		
		List <WebElement> aboveValueList = driver.findElements(with(By.tagName("p")).above(ele));
		for(WebElement e : aboveValueList) {
			String text = e.getText();
			System.out.println(text);
		}
		
        System.out.println("____________");
		
		//for below//This is only applicable for single element
		String belowValue = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowValue);
		
		//for near//This is only applicable for single element
		String nearValue = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearValue);*/
		
		driver.get("https://classic.freecrm.com/index.cfm?CFID=1840836&CFTOKEN=29d2de004b7bbbc2-36EF401F-EB3E-67F6-CDDB068EC9E90F05&jsessionid=a630c628e81e906167796d671560591e5315");
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();//linktext use text displayed on page
		
		
		WebElement ele = driver.findElement(By.linkText("Ali khan"));
		
		driver.findElement(with(By.tagName("td")).toLeftOf(ele)).click();
		
	}

}
