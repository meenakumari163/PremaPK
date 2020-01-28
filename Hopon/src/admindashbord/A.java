package admindashbord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			Thread.sleep(3000);
		    driver.get("https://www.google.co.in/");
	        Thread.sleep(3000);
	        driver.findElement(By.id("lst-ib")).sendKeys("selenium inter");
	        List<WebElement> alloptions= driver.findElements(By.xpath("//b[text()=' interview questions']"));
	        int count = alloptions.size();
	        System.out.println(count);
	        driver.close();
	        String Expectedvalue="selenium interview questions";
	        for (WebElement option : alloptions){
	        	String text = option .getText();
	        	System.out.println(text);
	        	if (text.equalsIgnoreCase(Expectedvalue)) {
	        	option.click();
	        		
	        	}
	        
	        
	        }
	      }
	}

/*String Expectedvalue="Vishwas J-vishwas244@hopon.co.in";"
List<WebElement> alloptions= driver.findElements(By.id("approver:name1_input"));
 for (WebElement option : alloptions) {
 String text=  option.getText();
 if(text.equalsIgnoreCase(Expectedvalue)) {
 option.click();*/
//WebElement intname = driver.findElement(By.id("approver:intimatename_input"));
//intname.sendKeys("");