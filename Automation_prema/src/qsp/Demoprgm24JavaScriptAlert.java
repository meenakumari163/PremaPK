package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Demoprgm24JavaScriptAlert  extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		Alert alert= driver.switchTo().alert();
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();
		
		driver.close();
		
	}

}
