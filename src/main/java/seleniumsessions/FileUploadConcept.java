package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		//type="file" -- then only work
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\krishna\\Desktop\\Banknifty\\1 April\\1 min.png");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
    public static void doFileUpload(By locator,String path) {
    	getElement(locator).sendKeys(path);
    }
}
