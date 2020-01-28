package qsp;

import org.openqa.selenium.By;

public class XpathActitime extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("user");		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
			Thread.sleep(3000);
	}

}
