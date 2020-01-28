package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testclass extends baseclass {

	public static void main(String[] args) {

		driver.get("http://demo.actitime.com/login.do");
		
		WebElement obj = driver.findElement(By.id("username"));
		
		obj.sendKeys("admin1");
		
		driver.navigate().refresh();
		
		obj.sendKeys("admin2");
		
		driver.close();
		
				
	}

}
