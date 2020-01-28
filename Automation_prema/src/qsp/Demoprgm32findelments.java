package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm32findelments extends Demoprgm3{
	public static void main(String[] args) throws InterruptedException {
	
		driver.get("https://www.google.co.in");
		driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> allelements = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		System.out.println(allelements.size());
		for (WebElement element : allelements) {
			String text = element.getText();
			System.out.println(text);
			if(text.equals("selenium interview questions")) {
				element.click();
				break;
			}
		}
		driver.close();
	}



}
