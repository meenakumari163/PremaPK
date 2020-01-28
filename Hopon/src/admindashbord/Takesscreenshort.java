package admindashbord;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesscreenshort {

	    public static void main(String[] args) throws InterruptedException, IOException {
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
				
		
	     driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
	     Thread.sleep(3000);
	    
			
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 File srcFile=ts.getScreenshotAs(OutputType.FILE);
		 File destFile=new File("./screenshot/screenshot.png");
		 FileUtils.copyFile(srcFile, destFile);
		 driver.close();
		 
	}

}
