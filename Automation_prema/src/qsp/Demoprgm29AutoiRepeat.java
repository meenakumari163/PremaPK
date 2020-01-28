package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

public class Demoprgm29AutoiRepeat extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("(//input[@type='file'])[2]")).click();
		Thread.sleep(3000);
		String relativepath=".\\autoit\\prema.exe";
		File f =new File(relativepath);
		String absolutepath =f.getAbsolutePath();
		Runtime.getRuntime().exec(absolutepath);
		
		

	}

}
