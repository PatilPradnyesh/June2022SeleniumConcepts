package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");

		Thread.sleep(4000);

		//driver.findElement(By.xpath("//li[text()='Casual Dresses > Printed ']")).click();
		doSearch("li", "Casual Dresses > Printed ");

		// xpath = //li[text()='Casual Dresses > Printed ']
		// li ---Tag name before 2 forward slash
		// sq bracket inside we are finding with text hence text() with parenthesis and
		// whatever text in single colun complete bracket

	}
	public static void doSearch(String tagName, String text) {
		By suggLocator = By.xpath("//"+tagName+"[text()='"+text+"']");
	    driver.findElement(suggLocator).click();
	}
   
}
