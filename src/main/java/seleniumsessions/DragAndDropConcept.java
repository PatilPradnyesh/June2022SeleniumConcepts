package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {
    static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By sourceEle = By.id("draggable");
		By targetEle = By.id("droppable");
		
		//Actions act = new Actions(driver);
		//1st way//act.clickAndHold(driver.findElement(source)).moveToElement(driver.findElement(target)).release().build().perform();
		
		//2nd way//act.dragAndDrop(driver.findElement(source), driver.findElement(target)).build().perform();
		
		doActionsDragAndDrop(sourceEle, targetEle);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsDragAndDrop(By sourceEle, By targetEle) {
		Actions act = new Actions(driver);
		act.dragAndDrop(getElement(sourceEle), getElement(targetEle)).build().perform();
	}

}
