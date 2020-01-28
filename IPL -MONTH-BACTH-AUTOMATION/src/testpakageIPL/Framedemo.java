package testpakageIPL;

import org.openqa.selenium.By;

public class Framedemo  extends  baseclass{

	public static void main(String[] args) {

		driver.get("file:///C:/Users/Dell/Desktop/Frame_Page2.html");
			
			driver.switchTo().frame(0);
			
			
			driver.findElement(By.id("t1")).sendKeys("t1t1t1t1t1");
			
			driver.switchTo().defaultContent();
			
			driver.findElement(By.id("t2")).sendKeys("t2t2t2t2t2");
			
			}

}
