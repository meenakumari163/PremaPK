package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadpopup {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");

	
	FirefoxProfile profile= new FirefoxProfile();
	
	String key= "browser.helperApps.neverAsk.saveTODisk";
	String value="application/zip";
	
	profile.setPreference(key, value); 
	

	
	FirefoxOptions option=new FirefoxOptions();
	option.setProfile(profile);

	
	WebDriver driver= new FirefoxDriver(option);
	driver.get("https://www.seleniumhq.org/");
	driver.findElement(By.xpath("//a[text()='Download']")).click();
	String xp="//td[text()='Java']/following-sibling::td/a[text()='Download']";
	driver.findElement(By.xpath(xp)).click();
	Thread.sleep(3000);
	
	}

}
