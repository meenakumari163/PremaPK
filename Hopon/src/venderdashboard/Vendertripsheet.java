package venderdashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Vendertripsheet extends Baseclass {

	public static void main(String[] args) throws InterruptedException {
		
     driver.manage().window().maximize();
     Thread.sleep(3000);
     driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@id='tab:Name']")).sendKeys("t_admin@hopon.co.in");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@id='tab:Password']")).sendKeys("123");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@id='tab:signin'][@class='btn signin_btn']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@href='/corp/pages/super_admin/vendorAdminTripsheet.xhtml']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@id='fromdt']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@id='todt']")).click();
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']")).click();
     Thread.sleep(3000);
     WebElement list = driver.findElement(By.id("daterangeForm:taxiCircle"));
	 Select s= new Select(list);
	 s.selectByIndex(7);
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@name='daterangeForm:j_idt198'][@class='btn btn-info']")).click();
     
      }
  }