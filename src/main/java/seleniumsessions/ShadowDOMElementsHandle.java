package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDOMElementsHandle {

	public static void main(String[] args) {
		
		//Browser
		//page -- elements
			//iframe -- elements
				//shadow dom -- elements -- tea

        //Browser
	    //page -- elements
		//shadow dom(open) -- elements -- tea
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();
        
        // driver.findElement(By.id("tea")).sendKeys("Masala Chai"); // NoSuchElementException
        
        driver.switchTo().frame("pact");
        
        //document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
        
        JavascriptExecutor js = (JavascriptExecutor)driver;//convert driver into javascriptexecutor  and store it in javaScriptExecutor js
    
        
        WebElement script = (WebElement)js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
        //store above in webelement after converting into webelement
        
        script.sendKeys("Masala Chai");
        
        
		
	}

}
