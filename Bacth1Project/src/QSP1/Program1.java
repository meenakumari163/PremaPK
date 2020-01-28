package QSP1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		driver.close();
		}
	

	}


