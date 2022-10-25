package seleniumsessions;

public class TestAmazon {

	public static void main(String[] args) throws Exception {
		BrowserUtil b= new BrowserUtil();
		b.launchBrowser("chrome");
		
		b.launchUrl("https:\\www.amazon.com");
		
		String title =b.getPageTitle();
		System.out.println(title);
		
		String url =b.getPageUrl();
		System.out.println(url);
		
		b.closeBrowser();
		
		

	}

}
