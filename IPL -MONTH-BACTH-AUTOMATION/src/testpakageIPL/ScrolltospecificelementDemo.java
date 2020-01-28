package testpakageIPL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrolltospecificelementDemo extends baseclass {

	public static void main(String[] args) {
		
   driver.get("https://www.seleniumhq.org/download");
   
   driver.findElement(By.id("close")).click();
  
   JavascriptExecutor js =(JavascriptExecutor)driver;
   WebElement app = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
   
   int xcor = app.getLocation().getX();
   int ycor = app.getLocation().getY();
   
   js.executeScript("window.scrollTO("+xcor+","+ycor+")");
   
   app.click();

	}

}
  