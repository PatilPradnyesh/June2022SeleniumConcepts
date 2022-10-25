package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/series/india-women-in-england-2022-1289245/england-development-squad-women-vs-india-women-warm-up-1332750/full-scorecard");
		//ancestor -- used to go towards grandparent
		
		
		//String wickTakerXpath = "//span[text()='Shafali Verma']/ancestor::td/following-sibling::td";
		//By wickTaker = By.xpath(wickTakerXpath);
		//String wickTakerName = driver.findElement(wickTaker).getText();
		//System.out.println(wickTakerName);
		
		//getWicketTaker("Shafali Verma");
		//getWicketTaker("Dayalan Hemalatha");
		
		//String scoreListXpath = "//span[text()='Shafali Verma']/ancestor::td/following-sibling::td";
		//By scoreList = By.xpath(scoreListXpath);
		
		//List<WebElement> batsmanScoreDetails = driver.findElements(scoreList);
		
		//for(WebElement e:batsmanScoreDetails) {
		//	String text= e.getText();
		//	System.out.println(text);
		//}
		
		System.out.println(getBatsmanDetails("Shafali Verma"));
		System.out.println(getBatsmanDetails("Dayalan Hemalatha"));
		System.out.println(getBatsmanDetails("Alexa Stonehouse"));
		
		//same xpath for bowling
		

	}
	public static ArrayList<String> getBatsmanDetails(String batsmenName) {
		//Same method for bowler details as well
		String scoreListXpath = "//span[text()='"+batsmenName+"']/ancestor::td/following-sibling::td";
		By scoreList = By.xpath(scoreListXpath);
		
		List<WebElement> batsmanScoreDetails = driver.findElements(scoreList);
		ArrayList <String> batDetails = new ArrayList<String>();
		
		for(WebElement e:batsmanScoreDetails) {
			String text= e.getText();
			if(text.length()!=0) {
			batDetails.add(text);
		}
		}
		return batDetails;
	}
	
	public static String getWicketTaker(String batManName) {
		String wickTakerXpath = "//span[text()='"+batManName+"']/ancestor::td/following-sibling::td";
		By wickTaker = By.xpath(wickTakerXpath);
		
		String wickTakerName = driver.findElement(wickTaker).getText();
		System.out.println(wickTakerName);
		return wickTakerName;
	}
	

}
