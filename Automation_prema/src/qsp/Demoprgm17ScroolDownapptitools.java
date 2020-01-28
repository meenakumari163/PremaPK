package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class Demoprgm17ScroolDownapptitools  extends Demoprgm3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver.get("http://www.seleniumhq.org/download/");
		
		WebElement aptitools= driver.findElement(By.xpath("//img[@src='/sponsors/applitools.png']"));
		
		int x = aptitools.getLocation().getX();
        int y = aptitools.getLocation().getY();
		
		System.out.println(x +"......."+y);
		
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo( "+x+","+y+")");
		
 
	}



}
