package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(" the title of the page is" + title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("the url of the page is " + currentUrl);
		//String pageSource = driver.getPageSource();
		//System.out.println ("The source code of the page is:" + pageSource);
	    Thread.sleep(2000);
	    driver.close();
		}
	}


