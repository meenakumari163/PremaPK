package admindashbord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver= new  ChromeDriver();
				
	    driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
		
		Thread.sleep(3000);
		
		//driver.close();
		
	}

}
