package testpakageIPL;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo13TakesScreenshotPgm {

	public static void main(String[] args) throws IOException {
	   
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
		
		WebDriver driver =new FirefoxDriver();
		 
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./screenshot/actitimelogin.png");
		
		FileUtils.copyFile(srcFile, destfile);
		driver.close();
	
	}

	
}
