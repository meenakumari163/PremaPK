package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TrialVender extends Baseclass{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  WebElement un = driver.findElement(By.id("tab:Name"));  
		  un.sendKeys("c_admin@hopon.co.in");
		  Thread.sleep(2000);
		  WebElement pwd = driver.findElement(By.id("tab:Password"));
		  pwd.sendKeys("123");
		  Thread.sleep(2000);
		  WebElement lgnbtn = driver.findElement(By.id("tab:signin"));
		  lgnbtn.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/corp/pages/rides/guest_ride.xhtml']")).click();
		  Thread.sleep(2000);
		  
		  
		  WebElement vendr = driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
		  vendr.click();
		  Thread.sleep(2000);
		  vendr.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li[10]")).click();
		  Thread.sleep(2000);
		  
		  driver.close();
	}  
	
}
