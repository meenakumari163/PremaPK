package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

public class Demoprgm20OffelineActitime extends Demoprgm9 {

	public static void main(String[] args) throws AWTException  {
		
				
	    driver.get("http://dell-pc/login.do");
		 WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		 Actions action = new  Actions(driver);
		 action.contextClick(link).perform();
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_W);
		 r.keyRelease(KeyEvent.VK_W);
 



	}

}
