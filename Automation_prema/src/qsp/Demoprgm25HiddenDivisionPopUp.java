package qsp;

import org.openqa.selenium.By;

public class Demoprgm25HiddenDivisionPopUp extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
	
		
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[.='Cal'])[1]")).click();
         //driver.findElement(By.id("DepartDate")).click();
		//driver.findElement(By.cssSelector("input[id='DepartDate'][size='10'][title='Depart date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("30")).click();
		
		

	}

}
