package testpakageIPL;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AotuITDemo extends baseclass{

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		driver.get("http://demo.actitime.com/login.do");
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\java\\IPL -MONTH-BACTH-AUTOMATION\\autoit\\kumari.exe ");

	}

}
