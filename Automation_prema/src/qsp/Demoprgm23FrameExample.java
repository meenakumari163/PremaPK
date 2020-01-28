package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm23FrameExample extends Demoprgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver. get("file:///C:/Users/Dell/Desktop/Frame_Page2.html");
		
		WebElement fraeObj = driver. findElement(By.xpath("//iframe[@class='c1']"));
		// use index
		driver.switchTo().frame(fraeObj);
		//use name attribute
		//driver.switchTo().frame("n1");
		//use id attribute
		//driver.switchTo().frame("f1");
		//use address of the frame and here frame is the webelement
		//driver.switchTo().frame(fraeObj);
		
		driver. findElement(By.id("t1")).sendKeys("admin");
		
		driver.switchTo().defaultContent();
	
		
		driver.findElement(By.id("t2")).sendKeys("manager");
		
		

	}

}
