package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImagesList {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
	//	List <WebElement> imagesList = driver.findElements(By.tagName("img"));
	//	System.out.println("Total no. of images : " +imagesList.size());
	//	
	//	for(WebElement e : imagesList) {
	//		String srcValue = e.getAttribute("src");
	//		String altValue = e.getAttribute("alt");
	//		System.out.println(srcValue+ " : " +altValue );
	//	}
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println("Total no. of links : " +getElementsCount(links));
		System.out.println("Total no. of images : " +getElementsCount(images));
		
		System.out.println(getElementsTextList(links));

	}
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static int getElementsCount (By locator) {
		return getElements(locator).size();
	}
	
	public static ArrayList <String> getElementsTextList(By locator) {
		List <WebElement> eleList = getElements(locator);
		ArrayList <String> eleTextList = new ArrayList<String>();
		
		for(WebElement e :eleList ) {
			String text = e.getText();
			
			if(text.length() != 0){
			 eleTextList.add(text);	
			}
		}
		return eleTextList;
	}

}
