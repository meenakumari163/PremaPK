package TestNGPackge;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGrid {
	@Parameters({"node","browser"})
	@Test
	
	public void testSeleniumGrid(String node, String browser) throws MalformedURLException {
	URL whichSystem=new URL(node);
	DesiredCapabilities whichBrowser=new DesiredCapabilities();
	whichBrowser.setBrowserName(browser);
	WebDriver driver= new RemoteWebDriver(whichSystem, whichBrowser);
	driver.get("http://demo.actitime.com/login.do");
	
	}
	

}
