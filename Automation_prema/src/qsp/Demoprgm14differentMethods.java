package qsp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm14differentMethods extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
	
		
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement username = driver.findElement(By.id("username"));
	boolean enabled = username.isEnabled();
	System.out.println(enabled +"element is enabled");
	boolean displayed = username.isDisplayed();
	System.out.println(displayed +"element is displayed");
	username.sendKeys("admin");
	Thread.sleep(3000);
	username.clear();
	driver.findElement(By.name("pwd")).sendKeys("manager");
	Thread.sleep(3000);
	
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	boolean selected = checkbox.isSelected();
	if(selected==true) {
		System.out.println("checkbox is selected");
	}
	else {
		System.out.println("checkbox is not selected");
	}
	
	checkbox.click();
	
	boolean selected2 = checkbox.isSelected();
	if(selected2==true) {
		System.out.println("checkbox is selected");
	}
	
	else {
		System.out.println("checkbox is not selected");
	
	}
	WebElement keepcheckbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	String attvalue = keepcheckbox.getAttribute("title");
	System.out.println(attvalue + "......> is the tooltip");
	
    WebElement ViewLicence = driver.findElement(By.id("copyRight"));
    String tagName = ViewLicence.getTagName();
    System.out.println(tagName +".........> is the tagname");
	
	String text = ViewLicence.getText();
	System.out.println(text +" is the actual text of the element");
	Thread.sleep(3000);
	driver.close();
    
    
    
   
    
	
	
	
	
	
	
	
	

	}

}
