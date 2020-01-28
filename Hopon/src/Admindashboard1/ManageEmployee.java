package Admindashboard1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ManageEmployee extends Baseclass {

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
		  driver.findElement(By.xpath("//a[@href='/corp/pages/settings/circle-member-upload.xhtml']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='ui-commandlink ui-widget btn btn-info']")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='approver:fName']")).sendKeys("Megha");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='approver:lName']")).sendKeys("kumari");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='approver:email']")).sendKeys("prema13_asho@rediffmail.com");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='approver:mobile']")).sendKeys("9438775834");
		  Thread.sleep(2000);
		  WebElement list = driver.findElement(By.id("approver:gender"));
		  Select s= new Select(list);
		  s.selectByIndex(2);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='approver:empId']")).sendKeys("T9B479");
		  Thread.sleep(2000);
		  WebElement list2 = driver.findElement(By.id("approver:dept"));
		  Select s2=new Select(list2);
		  s2.selectByIndex(1);
		  Thread.sleep(2000);
		  WebElement list3 = driver.findElement(By.id("approver:emptype"));
		  Select s3 =new Select(list3);
		  s3.selectByIndex(3);
		  Thread.sleep(2000);
		  WebElement Addr = driver.findElement(By.xpath("//input[@id='approver:address']"));
		  Addr.sendKeys("kanakapura karnatka india");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//a[@class='btn btn-info apprvAddBtn']")).click();
		  Thread.sleep(2000);
		  Alert alert = driver.switchTo().alert();
		  alert.accept();
		  Thread.sleep(2000);
		  WebElement sucssmagobj = driver.findElement(By.xpath("//span[@class='form-message']"));
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
		       if (actlsucssmsgtext.contains("User registered successfully"))
		       {
		    	   System.out.println(" valid success message");
		       }
		       else
		       {
		    	   System.out.println(" Invalid success message");
		       }
		  
		  }

}
//User registered successfully.
