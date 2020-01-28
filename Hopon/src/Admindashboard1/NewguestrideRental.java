package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewguestrideRental extends Baseclass{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  WebElement un = driver.findElement(By.id("tab:Name"));  
		  un.sendKeys("c_admin@hopon.co.in");
		  Thread.sleep(2000);
		  driver.findElement(By.id("tab:Password")).sendKeys("123");
		  Thread.sleep(2000);
		  driver.findElement(By.id("tab:signin")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/corp/pages/rides/guest_ride.xhtml']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='radio']//label[@for='rentalCheck']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='package440']")).click();
		  Thread.sleep(2000);
		  WebElement add = driver.findElement(By.xpath("//input[@id='tab1:rentaladdress']"));
		  add.sendKeys("kanakapura karnatka india");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='rentalcurentD']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']/div[@class='dtpicker-comp minutes']/a[@class='dtpicker-compButton increment dtpicker-compButtonEnable']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']/div[@class='dtpicker-comp minutes']/a[@class='dtpicker-compButton increment dtpicker-compButtonEnable']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']/div[@class='dtpicker-comp minutes']/a[@class='dtpicker-compButton increment dtpicker-compButtonEnable']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='tab1:comments']")).sendKeys("I will get down");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@class='btn btn-info']")).click();
		  }

}
