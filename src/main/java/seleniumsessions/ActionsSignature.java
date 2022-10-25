package seleniumsessions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSignature {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://signature-generator.com/draw-signature/");
		
		Actions act = new Actions(driver);
		
		WebElement canvas = driver.findElement(By.id("signature-pad"));
		
		  act.click(canvas).moveToElement(canvas,3,3).clickAndHold(canvas).moveByOffset(50, 50)
				.moveByOffset(30, 30).moveByOffset(100,20).release(canvas).build().perform();
		
		

	}

}
