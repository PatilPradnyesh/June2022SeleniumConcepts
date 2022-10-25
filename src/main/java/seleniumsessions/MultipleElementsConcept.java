package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		//one element - findElement - return WebElement
		//multiple element - findElements - return List <WebElement>
		
		//total no. of links
		//print text of each link
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		List <WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links : " +linksList.size());
		
		//to print
		//with simple for loop
		/*for (int i=0; i<linksList.size(); i++) {
			String text = linksList.get(i).getText();
			
			if(text.length() != 0) {
			System.out.println(text);
			}
		}*/
		
		//with for each loop
		//print attribute along with links
		//for(WebElement e : linksList) {
			//String text = e.getText();
			
			//if(text.length() != 0) {
				//System.out.println(text);
		//	}
			//String attrVal = e.getAttribute("href");
			//System.out.println(attrVal);
		//}
		
		By links = By.tagName("a");
		By images = By.tagName("img");
		
		System.out.println("total links : " +getElementsCount(links));
		System.out.println("total images : " +getElementsCount(images));
		
		System.out.println(getElementsTextList(links));
		
	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static ArrayList<String> getElementsTextList(By locator){
		List <WebElement> eleList = getElements(locator);
		ArrayList <String> eleTextList = new ArrayList<String>();
		
		for(WebElement e: eleList) {
			String text = e.getText();
			if(text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}

}
