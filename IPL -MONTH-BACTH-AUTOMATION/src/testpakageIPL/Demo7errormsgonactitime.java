package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo7errormsgonactitime extends  baseclass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		
		WebElement errorobj = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again."));
        boolean displayed = errorobj.isDisplayed();
        if(displayed) {
        	System.out.println("Error msg is displayed");
        }
        else {
        	System.out.println("Error msg is not displayed");
        	
        }
	}

}
