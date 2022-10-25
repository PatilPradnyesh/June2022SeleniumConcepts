package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumTopCasting {

	public static void main(String[] args) {
		
		//1)
		//ChromeDriver driver = new ChromeDriver();//Valid -chrome,firefox,safari,edge
		
		//2)//Valid//Generally we use this topcasting as it is with Interface 
		//so we can directly implement our own method
		//used to run test cases on local machine
		//WebDriver driver = new ChromeDriver();//Valid
		//driver= new FirefoxDriver();
		//driver=new SafariDriver();
		//driver=new EdgeDriver();
		
		//3)Valid but not usefull because we can access only 2 methods (FE and FEs)
		//SearchContext driver = new ChromeDriver();
		
		//4)Valid and usefull but generally use 2nd one
		//RemoteWebDriver driver = new ChromeDriver();
		
		//5)Valid and used to test cases remote machine(Cloud,server,aws,grid)
		 //WebDriver driver =new RemoteWebDriver();
		
		//6)Valid but only limited methods
		//SearchContext driver = new RemoteWebDriver();

	}

}
