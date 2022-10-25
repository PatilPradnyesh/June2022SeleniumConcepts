package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;

public class LaunchURLOverloading {

	//below first one method is overloading of launch url method
		WebDriver driver;
		public void launchUrl(URL url) throws Exception {
			System.out.println("Launching url");
			String newURL =String.valueOf(url);

			if (newURL == null) {
				System.out.println("Plz pass right url");
				throw new Exception("URL is null");
			}
			if (newURL.length() == 0) {
				System.out.println("Url is blank");
				throw new Exception("url is blank");
			}
			if (newURL.indexOf("http") == -1) {
				System.out.println("Plz pass right url");
				throw new Exception("Protocol is missing");
			}

			driver.navigate().to(url);
		}
}
