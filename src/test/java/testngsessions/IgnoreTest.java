package testngsessions;

import org.testng.annotations.Test;

public class IgnoreTest {
	
	
	@Test (priority =1)
	public void searchTest() {
		System.out.println("SearchTest");
	} 
	
	@Test 
	public void logoTest() {
		System.out.println("LogoTest");
	} 
	
	@Test(enabled = false, description="Method is for Payment test", priority =1)
	public void paymentTest() {
		System.out.println("PaymentTest");
	} 

}
