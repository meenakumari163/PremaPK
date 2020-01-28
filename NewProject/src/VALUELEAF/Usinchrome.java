package VALUELEAF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usinchrome {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/device");
    //driver.close();
    String title = driver.getTitle();
    System.out.println("the title of the page is:"   +title);
    String currentUrl = driver.getCurrentUrl();
    System.out.println("the title of the page is:"   +currentUrl);
    String pageSource = driver.getPageSource();
    System.out.println("the title of the page is:"   +pageSource);
    Thread.sleep(2000);
    //driver.close();
	}
	}
	 
