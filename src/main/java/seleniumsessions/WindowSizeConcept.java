package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSizeConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().setSize(new Dimension(500,500));//To set window in specific dimensions
		driver.get("https://in.search.yahoo.com/yhs/search?p=google.com&hspart=fc&hsimp=yhs-2461&type=fc_ADDA49F0A8D_s58_g_e_d081920_n9998_c19&param1=7&param2=eJwtjMEKgzAMQH8lRwWpaa2dxc%2FYaYiHTjstra2ow7GvX4SRy3svJJMbu7a%2FPziiFFp2RR%2FJtdYN4bXChmuBJAMJ1wRuvQgrJqRikjOhKE42UXWR8G2IlvR1IZiyZgjZ6eKYzh3iARwZtkBByRY%2BSuZg1jXY0z69O8q6urFKQebnYwkFBOctTHbwKYdh3tJiS4708RrYzcts7n%2FyA99IOuc%3D");

	}

}
