package admindashbord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class 	Pgm1OpenApplication {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			WebDriver driver= new  ChromeDriver();
			Thread.sleep(3000);
					
		    driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
			Thread.sleep(3000);
			String title = driver.getTitle();
			System.out.println(title);
			//driver.close();
		}
	}

