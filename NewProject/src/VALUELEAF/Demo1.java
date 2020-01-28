package VALUELEAF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		Thread.sleep(1000);
		driver.get("https://www.facebook.com");
		driver.close();
    }
}
