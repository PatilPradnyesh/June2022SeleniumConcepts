package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGConcept {

	//global pre conditions
	//pre condions
	//test steps
	     //data
	     //assert -- exp vs act
	     //status
	//post steps
	
	/* 
	 *BS -- connectWithDB
      BT -- createTestUser
      BC -- launchBrowser
      
             BM -- login
             add to cart test
             AM -- logout
             
             BM -- login
             payment test
             AM -- logout
             
             BM -- login
             search test
             AM -- logout
             
      AC -- closeBrowser
      AT -- deleteUser
      AS -- disconnectWithDB
	 **/
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS -- connectWithDB");
	}
	
	@BeforeTest
	public void createTestUser() {
		System.out.println("BT -- createTestUser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launchBrowser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("BM -- login");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	@Test
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	@Test
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- closeBrowser");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- deleteUser");
	}
	
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}
	
	
}
