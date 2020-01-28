package qsp;

import org.openqa.selenium.JavascriptExecutor;


public class Demoprgm16JavaScriptExcutor extends  Demoprgm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver.get("https://demo.actitime.com/login.do");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('username').value='prema'");
		
		
		
				
		

	}

}
