package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Demoprgm14Robot  extends Demoprgm3{

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		driver.get("https://demo.actitime.com/login.do");
		
		Robot r =  new Robot();
		r.mouseMove(600, 800);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}