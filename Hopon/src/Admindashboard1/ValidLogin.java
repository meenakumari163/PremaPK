package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidLogin extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
		/*driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
		Thread.sleep(1000);
		driver.findElement(By.id("tab:Name")).sendKeys("c_admin@hopon.co.in");
        Thread.sleep(1000);
		driver.findElement(By.id("tab:Password")).sendKeys("123");
	    Thread.sleep(1000);
		driver.findElement(By.id("tab:signin")).click();
		Thread.sleep(1000); 
		driver.close();*/
		driver.get("https://demo.actitime.com/login.do");
		WebElement  UNTB=  driver.findElement(By.id("username"));
		 UNTB.sendKeys("user");
		driver.findElement(By.name("pwd")).sendKeys("user");
		
		driver.findElement(By.id("loginButton")).click();
		
	}

}
