package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//ChromeDriver: chrome on WINDOWS (791742f013602bd85919fd661c4cc6e9)
		
	    driver.get("https:\\www.facebook.com");
	    //ChromeDriver: chrome on WINDOWS (791742f013602bd85919fd661c4cc6e9)
	    
	    String title =driver.getTitle(); 
	    //ChromeDriver: chrome on WINDOWS (791742f013602bd85919fd661c4cc6e9)
	    
	    System.out.println(title);
	    
	   // driver.quit();// org.openqa.selenium.NoSuchSessionException: Session ID is null.
	    // after this session id become null
	    
	    driver.close();// org.openqa.selenium.NoSuchSessionException: invalid session id
	    //after this session id become invalid
	    
	    driver = new ChromeDriver();//new session id created
	    driver.get("https:\\www.facebook.com");//new session id
	    
         title =driver.getTitle(); //new session id
	    
	    System.out.println(title);

	}

}
