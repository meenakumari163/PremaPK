
package qsp;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TakesScreenshotExample {

	

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		java.io.File srcFile = ts.getScreenshotAs(OutputType.FILE);

		java.io.File destFile = new  java.io.File(".\\screenshot\\screenshot.png");
		
		
		FileUtils.copyFile(srcFile, destFile);
		
		
		driver.close();
		

	}

}
