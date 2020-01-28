package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm26FileUpload  extends Demoprgm3{

	public static void main(String[] args) {
		
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		
		WebElement BrowsBtn = driver.findElement(By.xpath("(//input[@type='file'])[2]"));
		BrowsBtn.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		

	}

}
