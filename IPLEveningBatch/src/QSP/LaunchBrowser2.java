package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {

public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("title is"+title);
		driver.close();
		}
	}
            