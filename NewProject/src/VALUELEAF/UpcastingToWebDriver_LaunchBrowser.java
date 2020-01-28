package VALUELEAF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingToWebDriver_LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com");
        //driver.close();
	}

}

