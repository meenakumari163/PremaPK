package testpakageIPL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsDemo extends baseclass {

	public static void main(String[] args) {
	
	driver.get("http://demo.actitime.com/login.do");
	
	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	
	for(WebElement link:allLinks) {
		
		String atext = link.getText();
		
		if(atext.equals("View License"))
		{
			link.click();
			break;
		}
	}
	
    driver.close();
	}

}
