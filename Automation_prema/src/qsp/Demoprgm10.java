package qsp;

import org.openqa.selenium.By;

public class Demoprgm10 extends Demoprgm3 {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/Dell/Desktop/TagnameP.html");
		driver.findElement(By.cssSelector("input[id='UN123']")).sendKeys("user");
		driver.findElement(By.cssSelector(".C123")).sendKeys("user");
		driver.findElement(By.cssSelector("[href='https://www.google.co.in']")).click();
		
		
		

}
}