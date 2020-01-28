package admindashbord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Pgm2Homepage {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
		WebDriver driver= new  ChromeDriver();
		Thread.sleep(3000);
				
	    driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	    
	    WebElement un = driver.findElement(By.id("tab:Name"));
	    un.sendKeys("h_admin@hopon.co.in");
		Thread.sleep(3000);
	    WebElement pwd = driver.findElement(By.id("tab:Password"));
	    pwd.sendKeys("123"); 
		Thread.sleep(3000);
	    WebElement lgnbtn = driver.findElement(By.id("tab:signin"));
	    lgnbtn.click();
	    Thread.sleep(3000);
	    String title = driver.getTitle();
		System.out.println(title);
	    
		driver.close();
	}
}
