package TestNGPackge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RuninmultipleBrowser {
	
	public WebDriver driver;
	static {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	     }
	
	@Parameters("browser")
	@Test
	public void parallelExecutionMultipleBrowsers(String browser) throws InterruptedException {
	
	System.out.println("browser");
	
	    if(browser.equals("firefox")) 
	    {
		driver=new FirefoxDriver();
	    }
		else
		{
			driver=new ChromeDriver(); 
		}
	driver.get("https://demo.actitime.com/login.do");
	 WebElement  UNTB=  driver.findElement(By.id("username"));
	 for(int i=1; i<10;i++) {
		 UNTB.sendKeys("admin"+i);
		 Thread.sleep(3000);
		 UNTB.clear();
		 
	 }
	}
}

		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	
	
	
	


