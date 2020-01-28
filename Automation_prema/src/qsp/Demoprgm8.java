package qsp;

import org.openqa.selenium.By;

public class Demoprgm8 extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
	
		driver.get("file:/C:/Users/Dell/Desktop/TagnameP.html");
       
		
		Thread.sleep(3000);

		driver.findElement(By.tagName("input")).sendKeys("user");
		
		Thread.sleep(3000);

		driver.findElement(By.className("C123")).sendKeys("user"); 
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("a")).click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);

		//using link text
		
		//driver.findElement(By.linkText(" GOOGLE")).click();
	    //driver.navigate().back();
		
		//Thread.sleep(3000);
		
		//using partial linktext
		
	   // driver.findElement(By.partialLinkText(" GOOG)")).click();
	   // Thread.sleep(3000);

	   }

}
