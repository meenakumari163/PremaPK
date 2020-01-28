package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ManageEmployeeType extends Baseclass  {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://hopon.co.in/corp/pages/settings/manage-approvers.xhtml#");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  WebElement un = driver.findElement(By.id("tab:Name"));
		  un.sendKeys("vishwas23@gmail.com");
		  Thread.sleep(2000);
		  WebElement pwd = driver.findElement(By.id("tab:Password"));
		  pwd.sendKeys("123");
		  Thread.sleep(2000);
		  WebElement lgnbtn = driver.findElement(By.id("tab:signin"));
		  lgnbtn.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/corp/pages/manageEmployeetype.xhtml']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@id='types:j_idt187']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='types:etype']")).sendKeys("HR");
		  Thread.sleep(2000);
		 // WebElement chkbox = driver.findElement(By.xpath("//input[@id='types:approver']"));
		  //chkbox.click();
		 driver.findElement(By.xpath("//a[@id='types:j_idt197']")).click();
     }

}
