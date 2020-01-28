package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm4 extends Demoprgm11 {

	

	public static void main(String[] args) {
		
	driver.get("https://demo.actitime.com/login.do");
	 WebElement  UNTB=  driver.findElement(By.id("username"));
	 UNTB.sendKeys("user");
	driver.findElement(By.name("pwd")).sendKeys("user");
	
	driver.findElement(By.id("loginButton")).click();
	
	//driver.close();
	
	


	}

}