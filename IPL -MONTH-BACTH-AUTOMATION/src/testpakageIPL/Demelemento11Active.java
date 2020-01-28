package testpakageIPL;

import org.openqa.selenium.WebElement;

public class Demelemento11Active extends baseclass {

	public static void main(String[] args) {
	
		driver.get("http://demo.actitime.com/login.do");
		
		WebElement activeElement = driver.switchTo().activeElement();
		
		activeElement.sendKeys("admin");
		
		//driver.close();

	}

}
