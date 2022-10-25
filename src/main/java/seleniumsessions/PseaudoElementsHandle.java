package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseaudoElementsHandle {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.manage().window().maximize();
        
        //window.getComputedStyle(document.querySelector("label[for='input-firstname']"),"::before").getPropertyValue("content")

       /* JavascriptExecutor js = (JavascriptExecutor)driver;
        
        String ele = js.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),\"::before\").getPropertyValue(\"content\")").toString();

        System.out.println(ele);
        
        if(ele.contains("*")) {
        	System.out.println("Element is mandatory");
        }
        else {
        	System.out.println("Element is not mandatory");
        }*/
        
        String ele ="return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),\"::before\").getPropertyValue(\"content\")";

        checkElementsIsMandatory(ele);
       
        
	}
	
	public static boolean checkElementsIsMandatory(String jscript) {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	     String ele = js.executeScript(jscript).toString();

	     System.out.println(ele);
	        
	        if(ele.contains("*")) {
	        	System.out.println("Element is a mandatory field");
	        	return true;
	        }
	        else {
	        	System.out.println("Element is not a mandatory field");
	        	return false;
	        }
		
	}

}
