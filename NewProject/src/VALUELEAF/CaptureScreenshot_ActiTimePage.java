package VALUELEAF;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot_ActiTimePage {

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		driver.get("https://www.actitime.com/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile= new File(".\\screenshot\\"+"_"+"_actiTIMELogin.png");
		FileUtils.copyFile(srcFile, destFile);
		//FileUtils.copyDirectory(srcFile , destFile);
		 driver.close();

	}

}
