package VALUELEAF;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Mouse_Operations {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.navigate().to("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		Robot r = new Robot();
       r.mouseMove(300,500);
       r.keyPress(KeyEvent.VK_ALT);
       r.keyPress(KeyEvent.VK_F);
       r.keyRelease(KeyEvent.VK_F);
       r.keyPress(KeyEvent.VK_ALT);
       Thread.sleep(3000);
       r.keyPress(KeyEvent.VK_ALT);
       r.keyPress(KeyEvent.VK_W);
       r.keyRelease(KeyEvent.VK_W);
       r.keyPress(KeyEvent.VK_ALT);
       Thread.sleep(2000);
       driver.close();
		
	}

}
