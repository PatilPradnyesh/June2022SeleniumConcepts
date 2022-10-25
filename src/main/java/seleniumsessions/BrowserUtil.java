package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialize driver on the basis of browser Name
	 * @param browserName
	 */
	
	public WebDriver launchBrowser(String browserName) {
		System.out.println("Launching browser "  +browserName);
		switch (browserName) {
		case "chrome":
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\krishna\\Desktop\\Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			//System.setProperty("webdriver.gecko.driver", "C:\\Users\\krishna\\Desktop\\Driver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
		    //System.setProperty("webdriver.edge.driver", "C:\\Users\\krishna\\Desktop\\Driver\\msedgedriver.exe");
		    WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		    break;
		    
		default:
			System.out.println("Plz pass right browser");
			break;
		}
		return driver;
    
	}

	public void launchUrl(String url) throws Exception {
		System.out.println("Launching url");

		if (url == null) {
			System.out.println("Plz pass right url");
			throw new Exception("URL is null");
		}
		if (url.length() == 0) {
			System.out.println("Url is blank");
			throw new Exception("url is blank");
		}
		if (url.indexOf("http") == -1) {
			System.out.println("Plz pass right url");
			throw new Exception("Protocol is missing");
		}

		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();

		if (title != null) {
			System.out.println("getting title");
			return title;
		} else {
			System.out.println("getting null title");
			return null;
		}
	}

	public String getPageUrl() {
		String url = driver.getCurrentUrl();
		if (url != null) {
			System.out.println("Getting url");
			return url;
		} else {
			System.out.println("Getting null url");
			return null;
		}
	}

	public void quitBrowser() {
		System.out.println("Closing browser");
		if (driver != null) {
			driver.quit();
			System.out.println("Browser is succesfully closed");
		}
	}

	public void closeBrowser() {
		System.out.println("Closing browser");
		if (driver != null) {
			driver.close();
			System.out.println("Browser is succesfully closed");
		}
	}

}
