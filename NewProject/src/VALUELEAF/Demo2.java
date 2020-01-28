package VALUELEAF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			//ebDriver driver1=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.get("http://13.232.216.75/sms-panel/newdashboard");
			Thread.sleep(1000);
			//driver.close();
	    }
  }
