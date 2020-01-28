package QSP;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot  extends Baseclass{

	public static void main(String[] args) throws IOException {
	 Date d= new Date();
	 String date1 = d.toString();
	 String date2 = date1.replaceAll(":","_");
	 System.out.println(date2);
	 
	 driver.get("http://demo.actitime.com/login.do");	
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File srcFile=ts.getScreenshotAs(OutputType.FILE);
	 File destFile=new File("./screenshot/"+date2+"_"+"_actiTIMELogin.png");
	 FileUtils.copyFile(srcFile, destFile);
	}

}
