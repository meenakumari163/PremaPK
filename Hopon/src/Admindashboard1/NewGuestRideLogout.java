package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewGuestRideLogout extends Baseclass  {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  WebElement un = driver.findElement(By.id("tab:Name"));  
		  un.sendKeys("c_admin@hopon.co.in");
		  Thread.sleep(2000);
		  WebElement pwd = driver.findElement(By.id("tab:Password"));
		  pwd.sendKeys("123");
		  Thread.sleep(2000);
		  WebElement lgnbtn = driver.findElement(By.id("tab:signin"));
		  lgnbtn.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@href='/corp/pages/rides/guest_ride.xhtml']")).click();
		  Thread.sleep(2000);
		  //WebElement radiobtn1 = driver.findElement(By.xpath("//input[@id='adhocCheck']"));
		  //radiobtn1.click();
		  Thread.sleep(2000);
		  WebElement radiobtn2 = driver.findElement(By.xpath("//input[@id='logOUTCheck']"));
		  radiobtn2.click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='curentD']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']//div[@class='dtpicker-comp minutes']//a[@class='dtpicker-compButton increment dtpicker-compButtonEnable']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']//div[@class='dtpicker-comp minutes']//a[@class='dtpicker-compButton increment dtpicker-compButtonEnable']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']//div[@class='dtpicker-comp minutes']//a[@class='dtpicker-compButton increment dtpicker-compButtonEnable']")).click();
		  Thread.sleep(2000);
		  //driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']//div[@class='dtpicker-comp minutes']//input[@class='dtpicker-compValue']")).clear();
		  //Thread.sleep(2000);
		  //driver.findElement(By.xpath("//div[@class='dtpicker-compOutline dtpicker-comp6']//div[@class='dtpicker-comp minutes']//input[@class='dtpicker-compValue']")).sendKeys("35");
		  //Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']")).click();
		  Thread.sleep(2000);
		  
		  WebElement vendr = driver.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']"));
		  vendr.click();
		  Thread.sleep(2000);
		  vendr.findElement(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li[10]")).click();
		  Thread.sleep(2000);
		 
		  WebElement empname = driver.findElement(By.xpath("//input[@id='tab1:fname_input']"));
		  empname.sendKeys("prema ku");
		  Thread.sleep(2000);
		  WebElement nme = empname.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']"));
		  Thread.sleep(2000);
		  nme.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@class='btn hopon_action_btn btn-success']")).click();
		  WebElement sucssmagobj = driver.findElement(By.xpath("//span[@class='form-message'] "));
		  boolean displayed = sucssmagobj.isDisplayed();
		  //verify the success message is displayed 
		  if (displayed) {
			  System.out.println("Success message is dispalyed");
			 }
		  else
		   {
			  System.out.println("Success message not is dispalyed");
			 }
		  //verify the  success message text is correct
		       String actlsucssmsgtext = sucssmagobj.getText();
		       System.out.println("Actal susscess message is---"+actlsucssmsgtext);
		       if (actlsucssmsgtext.contains("Guest Ride added successfully"))
		       {
		    	   System.out.println(" valid success message");
		       }
		       else
		       {
		    	   System.out.println(" Invalid success message");
		       }
		  
	 
		  }
	

	}


