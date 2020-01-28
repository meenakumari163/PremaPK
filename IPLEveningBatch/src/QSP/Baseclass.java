package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	
		// set the path of the driver executable
	     static
	     {
	    	// System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	    	 
	    	 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    	 
	    	 //System.setProperty("webdriver.ie.driver","./driver/IEDriverServer.exe");
	      }	
	     //public static WebDriver driver = new FirefoxDriver();
	     public static WebDriver driver = new ChromeDriver();
	     
		 
	                    
	}

