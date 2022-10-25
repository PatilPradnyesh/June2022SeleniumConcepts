package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		// Above line is for configuration of chrome driver 1) is key which is always
		// same for chrome  2) is path where chrome driver is located

		WebDriver driver = new ChromeDriver();
		// webdriver is an interface
		// driver is object reference varible
		// new chromedriver is object
		// this top casting parent interface reference varible referring child class
		// object
		
	    driver.get("https:\\www.facebook.com");//line for url in which https or http is mandatory
	    
	    String title =driver.getTitle(); //method for getting title --Tab name
	    System.out.println(title);
	    
	    //below code is validation for title
	    if(title.equals("Facebook – log in or sign up")) {
	    	System.out.println("Pass");
	    }
	    else {
	    	System.out.println("Fail");
	    }
	    
	    String url =driver.getCurrentUrl();//method for getting current url
	    System.out.println(url);
	    
	    String source =driver.getPageSource(); //for getting source info
	    //System.out.println(source);
	    
	    
	    driver.quit();//for closing browser

	}

}
