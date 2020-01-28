package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demoprgm13DragandDrop  extends Demoprgm3{

	public static void main(String[] args) {
		
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
		WebElement srcblock = driver.findElement(By.xpath("//h1[.='Block 1']"));
		
		WebElement destblock= driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDrop(srcblock,destblock).build().perform();
		
		
		

	}

}
