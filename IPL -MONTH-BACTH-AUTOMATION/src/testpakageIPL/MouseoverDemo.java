package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseoverDemo extends baseclass {

	public static void main(String[] args) {
		
	driver.get("http://www.istqb.in");

	WebElement obj=driver.findElement(By.xpath("//a[text()='FOUNDATION']"));
	
	Actions action= new Actions(driver);
	
	action.moveToElement(obj).perform();
	
	
	
	

	}

}
