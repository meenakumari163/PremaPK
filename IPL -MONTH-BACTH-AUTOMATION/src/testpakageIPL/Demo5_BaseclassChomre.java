package testpakageIPL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5_BaseclassChomre {
	
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
       }
		
		static WebDriver driver= new ChromeDriver();
		
	}

