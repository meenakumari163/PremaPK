package testpakageIPL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class baseclass {
static {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
       }
		
		static WebDriver driver= new FirefoxDriver();
		
		

}
