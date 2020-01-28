package testpakageIPL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Demo8AlertPopup  extends Demo5_BaseclassChomre{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);
	  Alert alert = driver.switchTo().alert();
	 alert.accept();
	 // alert.dismiss();
	  String alerttext = alert. getText();
	 
	  if(alerttext.equals("Enter User ID")) {
		  System.out.println(" alert msg is same");
		   }
	  else {
	  System.out.println("alert msg is not  same");
	  }
	 
	 
}

	
}
