package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationExample  {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://demo.actitime.com/login.do ");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		}

}
