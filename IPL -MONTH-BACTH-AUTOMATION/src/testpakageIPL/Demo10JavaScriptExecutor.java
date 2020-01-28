package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Demo10JavaScriptExecutor  extends baseclass{

	public static void main(String[] args) {
		
		driver.get("https://demo.actitime.com/login.do");
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('username').value='admin'");
		
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		
		WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		jse.executeScript("arguments[0].click()",btn);
		
	
		
	
	}

}
