package QSP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm4 extends Baseclass {

	

	public static void main(String[] args) {
		
	driver.get("https://demo.actitime.com/login.do");
	WebElement  UNTB=  driver.findElement(By.id("username"));
	UNTB.sendKeys("user");
	driver.findElement(By.name("pwd")).sendKeys("user");
	
	driver.findElement(By.id("loginButton")).click();
	
	//driver.close();
	
	}

}