package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Demoprgm22 extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
        driver.get("http://istqb.in/#");
		
		WebElement foundectobj = driver.findElement(By.xpath("//span[.='FOUNDATION']"));
		
	Actions action = new Actions(driver);
	action.moveToElement(foundectobj).perform();
	Thread.sleep(3000);
	String Envi="//a[contains(@href,'https://enroll.istqb.in/Enrollment.php')]/span[.='ENROLLMENT']";
	WebElement objectenvi = driver.findElement(By.xpath(Envi));
    action .moveToElement(objectenvi).perform();
    Thread.sleep(3000);
    
    String corp = "//a[contains(@href,'#')]/span[.='CORPORATE ENROLLMENT']";
    
    WebElement objectcorp = driver.findElement(By.xpath(corp));
    action.moveToElement( objectcorp).perform();
    Thread.sleep(3000);
    
    String onenvi = "//a[contains(@href,'https://itb.formistry.com/')]/span[.='ONLINE ENROLLMENT']";
    
    WebElement objectonenvi = driver.findElement(By.xpath(onenvi));
    
    action.moveToElement(objectonenvi ).click().build().perform();
    Thread.sleep(3000);
    
	}

}
