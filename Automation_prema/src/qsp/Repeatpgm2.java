package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Repeatpgm2 {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		Thread.sleep(2000);
		driver.close();
		

	}

}
