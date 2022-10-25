package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
       // driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html\"");
       // driver.manage().window().maximize();
        
       /* Actions act = new Actions(driver);
        
        WebElement element = driver.findElement(By.cssSelector(".menulink"));
        
        act.moveToElement(element).build().perform();
        
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("COURSES")).click();
      */
        
       // By parentMenu = By.cssSelector(".menulink");
       //By childMenu =  By.linkText("COURSES");
        
       // handleLevel1MenuItems(parentMenu, childMenu);
        
        //Ass
        driver.get("https://www.bigbasket.com/");
        driver.manage().window().maximize();
        
       /* Actions act = new Actions(driver);
        
        act.moveToElement(driver.findElement(By.linkText("SHOP BY CATEGORY"))).build().perform();
        Thread.sleep(3000);
        
        act.moveToElement(driver.findElement(By.linkText("Bakery, Cakes & Dairy"))).build().perform();
        Thread.sleep(3000);
        
        act.moveToElement(driver.findElement(By.linkText("Non Dairy"))).build().perform();
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("Dairy Free (Vegan)")).click(); */
        
        By parent1Menu = By.linkText("SHOP BY CATEGORY");
        By parent2Menu = By.linkText("Bakery, Cakes & Dairy");
        By parent3Menu = By.linkText("Non Dairy");
        By childMenu =By.linkText("Dairy Free (Vegan)");
        
        handleLevel3MenuItems(parent1Menu, parent2Menu, parent3Menu, childMenu);
        
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void handleLevel1MenuItems(By parentMenuLocator, By childMenuLocator) throws InterruptedException {
        Actions act = new Actions(driver);
        WebElement element = getElement(parentMenuLocator);
        act.moveToElement(element).build().perform();
        Thread.sleep(3000);
        getElement(childMenuLocator).click();
	}
	
	public static void handleLevel2MenuItems(By parent1MenuLocator,By parent2MenuLocator, By childMenuLocator) throws InterruptedException {
        Actions act = new Actions(driver);
        WebElement element1 = getElement(parent1MenuLocator);
        act.moveToElement(element1).build().perform();
        Thread.sleep(3000);
        WebElement element2 = getElement(parent2MenuLocator);
        act.moveToElement(element2).build().perform();
        getElement(childMenuLocator).click();
	}
	
	public static void handleLevel3MenuItems(By parent1MenuLocator,By parent2MenuLocator,By parent3MenuLocator, By childMenuLocator) throws InterruptedException {
		Actions act = new Actions(driver);
		 act.moveToElement(getElement(parent1MenuLocator)).build().perform();
	     Thread.sleep(3000);
	        
	     act.moveToElement(getElement(parent2MenuLocator)).build().perform();
	     Thread.sleep(3000);
	        
	     act.moveToElement(getElement(parent3MenuLocator)).build().perform();
	     Thread.sleep(3000);
	        
	     getElement(childMenuLocator).click();
	}

}
