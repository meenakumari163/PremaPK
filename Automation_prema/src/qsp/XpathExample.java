package qsp;

import org.openqa.selenium.By;

public class XpathExample extends Demoprgm3 {

	public static void main(String[] args) {
		
	driver.get("file:///C:/Users/Dell/Desktop/TagnameP.html");
	driver.findElement(By.xpath("//input[@id='UN123']")).sendKeys("user");

    driver.findElement(By.xpath("//input[@id='PWD123']")).sendKeys("user");
    
    driver.findElement(By.xpath("//a[text()=' GOOGLE']")).click();
	}

}
