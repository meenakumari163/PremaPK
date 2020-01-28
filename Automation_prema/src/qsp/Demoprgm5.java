package qsp;

import org.openqa.selenium.By;

public class Demoprgm5 extends  Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubge
		driver.get("file:/C:/Users/Dell/Desktop/TagnameP.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("input")).sendKeys("user");
		driver.findElement(By.className("C123")).sendKeys("user");
//driver.switchTo().activeElement().sendKeys("user");
		
		
	}
		


	}


