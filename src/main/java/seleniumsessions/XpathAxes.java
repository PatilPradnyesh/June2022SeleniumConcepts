package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();//linktext use text displayed on page
		
		//xpath preceding -- //a[text()='Romi singh']/parent::td/preceding-sibling::td/input[@type='checkbox']
		// /parent::td for going to parent
		// /preceding-sibling::td for going to left sibling
		// /input going direct child
		
		//driver.findElement(By.xpath("//a[text()='Romi singh']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		//selectContact("Romi singh");
		//selectContact("Ali khan");
		
		/*By detailxpath = By.xpath("//a[text()='Romi singh']/parent::td/following-sibling::td");
		List<WebElement> detailsList = driver.findElements(detailxpath);
		ArrayList <String> contact_List = new ArrayList<String>(); 
		
		for(int i=0;i<detailsList.size()-1;i++) {
		     String text =detailsList.get(i).getText();
		     contact_List.add(text);
		}
		System.out.println(contact_List);
		*/
		
		//System.out.println(getDetails("Romi singh"));
		
		//xpath for options //a[text()='Romi singh']/parent::td/following-sibling::td//i[@title='Edit']
		
		optionClick("Romi singh", "Flag for user");
		
	}
    public static void selectContact(String userName) {
    	By con_Xpath = By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']");
    	driver.findElement(con_Xpath).click();
    }
    
    public static ArrayList<String> getDetails(String userName){
    	By detailxpath = By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td");
		List<WebElement> detailsList = driver.findElements(detailxpath);
		ArrayList <String> contact_List = new ArrayList<String>(); 
		
		for(int i=0;i<detailsList.size()-1;i++) {
		     String text =detailsList.get(i).getText();
		     contact_List.add(text);
		}
		return contact_List;
    }
	
	public static void optionClick(String userName,String titleValue) {
		By optionXpath = By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td//i[@title='"+titleValue+"']");
		driver.findElement(optionXpath).click();
	}
	
}
