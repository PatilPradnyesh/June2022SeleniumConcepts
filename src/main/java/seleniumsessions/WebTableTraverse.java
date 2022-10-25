package seleniumsessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableTraverse {
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String row = "//table[@id='customers']//tr";
		By rowXpath = By.xpath(row);
		//int rowCount = driver.findElements(rowXpath).size();
		//System.out.println(rowCount-1);
		
		String column = "//table[@id='customers']//th";
		By columnXpath = By.xpath(column);
		//int columnCount = driver.findElements(columnXpath).size();
		//System.out.println(columnCount);
		
		int rowCount = getRowCount(rowXpath);
		System.out.println(rowCount);
		
		int columnCount = getColumnCount(columnXpath);
		System.out.println(columnCount);
		
		//Xpath Pattern for Table
		//table[@id='customers']/tbody/tr[2]/td[1]
		//table[@id='customers']/tbody/tr[3]/td[1]
		//
		//
		//
		//table[@id='customers']/tbody/tr[7]/td[1]
		
		/*String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[1]";
		
		for(int i=2;i<=getRowCount(rowXpath)+1;i++) {
			String actXpath = beforeXpath + i + afterXpath;
			String text = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(text);
		}
		
		System.out.println("_____________________________________________");
		
		String contbeforeXpath = "//table[@id='customers']/tbody/tr[";
		String contafterXpath = "]/td[2]";
		
		for(int i=2;i<=getRowCount(rowXpath)+1;i++) {
			String actXpath = contbeforeXpath + i + contafterXpath;
			String text = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(text);
		}
		
		System.out.println("_____________________________________________");
		
		String countrybeforeXpath = "//table[@id='customers']/tbody/tr[";
		String countryafterXpath = "]/td[3]";
		
		for(int i=2;i<=getRowCount(rowXpath)+1;i++) {
			String actXpath = countrybeforeXpath + i + countryafterXpath;
			String text = driver.findElement(By.xpath(actXpath)).getText();
			System.out.println(text);
		}*/
		
		//String beforeXpath = "//table[@id='customers']/tbody/tr[";
		//String afterXpath = "]/td[";
		
		//ArrayList<String> columnList = getColumnValues(3, rowXpath, beforeXpath, afterXpath);
		//System.out.println(columnList);
		
		//String beforeXpath = "//table[@id='customers']/tbody/tr[";
		//String afterXpath = "]/td[";
		
		//ArrayList<String>rowsList = getRowsValues(2, columnXpath, beforeXpath, afterXpath);
		//System.out.println(rowsList);
		
		String beforeXpath = "//table[@id='customers']/tbody/tr[";
		String afterXpath = "]/td[";
		
		System.out.println(tableValues(rowXpath, columnXpath, beforeXpath, afterXpath));
		

	}
	public static ArrayList<String> tableValues(By rowXpath,By columnXpath,String beforeXpath,String afterXpath ) {
		ArrayList <String> tableValuesList = new ArrayList <String>();
		
		for(int i=2;i<=getRowCount(rowXpath)+1;i++) {
			for(int j=1;j<=getColumnCount(columnXpath);j++) {
			String actXpath = beforeXpath + i + afterXpath + j +"]";
			String text = driver.findElement(By.xpath(actXpath)).getText();
			tableValuesList.add(text);
			}
			
		}
		return tableValuesList;
	}
	
	public static ArrayList<String> getColumnValues(int columnNumber, By rowXpath,String beforeXpath,String afterXpath ) {
		ArrayList <String> columnValuesList = new ArrayList <String>();
		
		for(int i=2;i<=getRowCount(rowXpath)+1;i++) {
			String actXpath = beforeXpath + i + afterXpath + columnNumber +"]";
			String text = driver.findElement(By.xpath(actXpath)).getText();
			columnValuesList.add(text);
		}
		return columnValuesList;
	}
	
	public static ArrayList<String> getRowsValues(int rowNumber, By columnXpath,String beforeXpath,String afterXpath ) {
		ArrayList <String> rowsValuesList = new ArrayList <String>();
		
		for(int i=1;i<=getColumnCount(columnXpath);i++) {
			String actXpath = beforeXpath + rowNumber + afterXpath + i +"]";
			String text = driver.findElement(By.xpath(actXpath)).getText();
			rowsValuesList.add(text);
		}
		return rowsValuesList;
	}
	
	public static int getRowCount(By rowXpath) {
		int rowCount = driver.findElements(rowXpath).size();
		return rowCount-1;
	}
	
	public static int getColumnCount(By columnXpath) {
		int columnCount = driver.findElements(columnXpath).size();
		return columnCount;
	}

}
