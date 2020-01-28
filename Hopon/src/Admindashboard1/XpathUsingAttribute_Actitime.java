package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathUsingAttribute_Actitime extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
	
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='textField'][@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='textField pwdfield'][@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		WebElement clock = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		Thread.sleep(2000);
		String widthValue = clock.getAttribute("Width");
		System.out.println("the width is: "+ widthValue);
		Thread.sleep(2000);
		System.out.println("the  height of the clock element is:" + clock.getAttribute("height"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
