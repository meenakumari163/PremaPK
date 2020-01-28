package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends baseclass{

	public static void main(String[] args) {
		
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	
	WebElement src = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	
	WebElement dst = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	
	
	Actions action =new Actions(driver);
	
	action.dragAndDrop(src, dst).perform();
	
	}

}
