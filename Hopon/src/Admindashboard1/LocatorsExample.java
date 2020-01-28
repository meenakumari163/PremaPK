package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsExample extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement  UNTB=  driver.findElement(By.id("username"));
		 UNTB.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);;
		driver.findElement(By.id("loginButton")).click();
		

	}

}
