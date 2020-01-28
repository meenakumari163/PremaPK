package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demoprgm33 extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		WebElement monthlist = driver.findElement(By.id("month"));
		//driver.findElement(By.id(id))
		Select s=new Select(monthlist);
		
		
		s.selectByIndex(6);
		Thread.sleep(3000);
		//s.selectByValue("10");
		//Thread.sleep(3000);
		//s.selectByVisibleText("Jan");
		
		
		
		

	}

}
