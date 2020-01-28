package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoprgm2 {

	
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(2000);
			driver.close();
					

	}

}
                                