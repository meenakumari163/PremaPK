package testpakageIPL;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	    WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.close();


	}

}
