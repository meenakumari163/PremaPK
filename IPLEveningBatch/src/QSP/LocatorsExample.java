package QSP;

import org.openqa.selenium.By;

public class LocatorsExample extends Baseclass{

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
	    driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		//driver.findElement(By.linkText("actiTIME Inc.")).click();
		//Thread.sleep(2000);
		//driver.close();
	}

}
