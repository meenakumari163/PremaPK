package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoprgm7 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		Thread.sleep(2000);
		String title= driver.getTitle();
		System.out.println("Title of the page is:"+title);
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//String sourcecode=driver.getPageSource();
		//System.out.println("source codeis:"+sourcecode);
		driver.quit();
		
				

	}

}
