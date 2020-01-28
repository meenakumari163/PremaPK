package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demoprgm21MouseMovementExample  extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://istqb.in/#");
		
		WebElement foundectobj = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		
	Actions action = new Actions(driver);
	action.moveToElement(foundectobj).perform();
	Thread.sleep(3000);
	String xp = "//a[contains(@href,'foundation/procedure')]/span[.='PROCEDURE']";
	WebElement proceobj = driver.findElement(By.xpath(xp));
	action.moveToElement(proceobj).click().build().perform();

		
		

	}

}
