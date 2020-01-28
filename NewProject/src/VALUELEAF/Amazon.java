package VALUELEAF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {
	
	public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	Thread.sleep(1000);
	driver.get("https://www.amazon.in.");
	String title = driver.getTitle();
    System.out.println("the title of the page is:"   +title);
	//driver.close();
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone XR yellow");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Apple iPhone XR (64GB) - Yellow']")).click();
	Thread.sleep(1000);
	String text = driver.findElement(By.xpath("//div[@id='price']//tr[@id='priceblock_ourprice_row']//td[@class='a-span12'][1]//span[@id='priceblock_ourprice']")).getText();
	Thread.sleep(1000);
	System.out.println("the price of ipohne xr yellow is"+"_"+text);
}
}
