package superadmindashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SuperadminTripsheet extends Baseclass1{
	public static void main(String[] args) throws InterruptedException {
		
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@id='tab:Name'][@class='input-large signin_inputs']")).sendKeys("h_admin@hopon.co.in");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='tab:Password'][@name='tab:Password']")).sendKeys("123");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='tab:signin'][@class='btn signin_btn']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@href='/corp/pages/super_admin/superAdminTripsheet.xhtml']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='fromdt'][@class='startDate1']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='todt'][@class='endDate1']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']")).click();
	     Thread.sleep(2000);
	     WebElement list = driver.findElement(By.id("daterangeForm:taxiCircle"));
	     Select s= new Select(list);
	     s.selectByIndex(3);
	     WebElement name = driver.findElement(By.xpath("//input[@id='daterangeForm:fname_input'][@class='ui-autocomplete-input ui-inputfield ui-widget ui-state-default ui-corner-all']"));
	     name.sendKeys("prema kum");
	     
	        Thread.sleep(2000);
		    WebElement emp = name.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']"));
		    emp.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
		    Thread.sleep(2000);
	    
	    
	     WebElement list2 = driver.findElement(By.id("daterangeForm:vendorCircle"));
	     Select s2= new Select(list2);
	     s2.selectByIndex(9);
	     
		 WebElement bttn = driver.findElement(By.xpath("//input[@class='btn btn-info']"));
		 bttn.click();
		 
		 //driver.close();
	}
}