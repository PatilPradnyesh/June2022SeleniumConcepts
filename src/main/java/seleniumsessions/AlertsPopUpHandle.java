package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		//we can't inspect javascript alert's
		//three types of alerts
		//1)ALert
		//driver.findElement(By.xpath("//li/button[text()='Click for JS Alert']")).click();
		
		//Alert alert = driver.switchTo().alert();
		//System.out.println(alert.getText());
		//alert.accept();
		//alert.dismiss();
		
		//2) Confirm
		//driver.findElement(By.xpath("//li/button[@onclick='jsConfirm()']")).click();
		
		//Alert alert = driver.switchTo().alert();
		///alert.getText();
		//alert.accept();
		//alert.dismiss();
		
		//3)prompt
		driver.findElement(By.xpath("//li/button[@onclick='jsPrompt()']")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("pradnyesh");
		alert.accept();
		
		

	}

}
