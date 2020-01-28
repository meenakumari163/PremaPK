package testpakageIPL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9Variousmethods {

	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.com");
	
	String title = driver.getTitle();
	
	System.out.println("the title of the page is:"+title);
	
	String currentUrl = driver.getCurrentUrl();
	
	System.out.println("the e url of the page is:"+currentUrl);
	
	//String pageSource = driver.getPageSource();
	
    //System.out.println(" the sourcecode of the page is "+pageSource);
    
    Thread.sleep(3000);
    
    //driver.close();
	}
}