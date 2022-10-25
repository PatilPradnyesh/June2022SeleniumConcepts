package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");
		
		//xpath -- address of elements in dom
		//Two Xpath
		//1)Absolute Xpath
		///html/body/div[1]/nav/div[2]/ul/li[1]/a -- possibilities that it will change in future
		
		//2)Relative/Custom Xpath
		//xpath with one attr
		//htmltag[@attr='value']
		//img[@title='naveenopencart']
		//img[@class='img-responsive']
		
		//xpath with multiple attr
	    //htmltag[@attr1='value' and attr2='value']
		//a[@class='nav-a  ' and @data-csa-c-slot-id='nav_cs_0' ]
		//span[@id='nav-link-accountList-nav-line-1' and @class='nav-line-1 nav-progressive-content' ]
		
		//xpath with text() function
		//htmltag[text()='value']
		//a[text()='Sign in securely']
		//span[text()='Computer mice']
		
		//xpath with text and attr
		//we can change this sequence also
		//htmltag[text()='value' and @attr='value']
		//span[text()='Computer mice' and @class='a-size-small a-color-base truncate-2line']
		
		//xpath with text and att1 and att2
		//we can change seq also
		//htmltag[text()='value and @attr1='value' and @attr2='value']
		////a[text()='Amazon Devices' and @class='nav_a' and @href='/gp/browse.html?node=2102313011&ref_=footer_devices']

		//xpath with contains
		
		//contains() with attr
		//htmltag(contains(@attr1,'value'))
		////a[contains(@class,'quadrant-overlay')]
		
		//dynamic attr
		//<input id='firstname_133'> 
		//<input id='firstname_135'> 
		//input[contains(@id,'firstname')]
		
		//contains() with text
		//htmltag(contains(text(),'value'))
		//span[contains(text(),'Sports')]
		
		//contains with text and contains with attr
		//htmltag(contains(text(),'value') and contains(@attr,'value'))
		//span[contains(@class,'truncate-full')and contains(text(),'Sports')]
		
		//contains with text and attr
		//htmltag(contains(text(),'value') and @attr='value')
		////span[contains(text(),'Sports') and @class='a-truncate-full a-offscreen']
		
		//contains with att1 and attr2 this also fine
		
		//xpath with starts-with
		//htmltag[starts-with(@id,'value')]
		//a[starts-with(@id,'nav-logo')]
		
		//xpath with ends-with depricated
		
		//index
		//(xpath)[1]
		//(xpath)[last()]
		//(xpath)[position()=1]
		//(//a[@class='nav-a  '])[1]
		//(//a[@class='nav-a  '])[position()=1]
	    //(//a[@class='nav-a  '])[last()]	
		
		//help link on amazon
		//(//div[@class='navFooterVerticalRow navAccessibility']//li)[last()]
		
		//Syntax of Xpath is not correct - InvalidSelectorException
		//driver.findElement(By.xpath("//input[&**&*id=username]")).sendKeys("Test@123");
		
		//compound/multiple classes not allowed with classname selector only one(any) class is allowed
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("Test");
		//if we use compound class - InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("login-email")).sendKeys("Test");
		
		//using xpath selector we can use compound classes we need to put entire classes as value otherwise NoSuchElementException
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("Test");
	    //Xpath consider all class as combined value
		
		////div[@id='top-links']/child::ul
		//child::tagName ---- for going to direct child
		
		//div[@id='top-links']/../../..
		// /.. ---- for backward traversing
		
		// "value" or 'value' both fine
		
		//*[@id="top-links"]
		// * means entire dom keep checking 
		//always use tagname instead of *
	}

}
