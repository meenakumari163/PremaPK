package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoprgm12Siblings {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		  
			
			WebDriver driver = new FirefoxDriver();
			
			Thread.sleep(3000);
			
			driver.get("http://www.seleniumhq.org/download/");
			
		
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//td[.='Java']/following-sibling::td/a[.='Download']")).click();
			
			
			Thread.sleep(3000);
			
			
			driver.close();
			

	}

}
