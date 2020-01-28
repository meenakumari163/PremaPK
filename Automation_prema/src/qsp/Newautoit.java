package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Newautoit extends Demoprgm3 {

	
		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			// TODO Auto-generated method stub
		
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(3000);
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_P);
			String relativepath = ".\\autoit\\print3.exe";
			File f = new File(relativepath);
			String absolutePath = f.getAbsolutePath();
			Runtime.getRuntime().exec(absolutePath);
			driver.close();
			
			

	}

}
