package testpakageIPL;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dlassemo10Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		//launch the browser
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000); 
	
		//creating an object of Robot class
		
		Robot r=new Robot();
		
		r.mouseMove(300, 500);
		
		//press ALT Key from keyboard
		
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		
		//Release F and ALT key from keyboard
		
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT );
		
		Thread.sleep(3000);
	
		//press W key from keyboard to open a new private window
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		driver.quit();
	
		}
}