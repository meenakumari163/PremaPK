package admindashbord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm3ManageApprover {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			
			WebDriver driver= new  ChromeDriver();
			Thread.sleep(3000);
				
	
	driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
	Thread.sleep(3000);
	 WebElement un = driver.findElement(By.id("tab:Name"));
	    un.sendKeys("c_admin@hopon.co.in");
		Thread.sleep(3000);
	    WebElement pwd = driver.findElement(By.id("tab:Password"));
	    pwd.sendKeys("123"); 
		Thread.sleep(3000);
	    WebElement lgnbtn = driver.findElement(By.id("tab:signin"));
	    lgnbtn.click();
	    Thread.sleep(4000);
	    WebElement mngapp = driver.findElement(By.xpath("//a[@href='/corp/pages/settings/manage-approvers.xhtml']"));
	    mngapp.click();
	    Thread.sleep(4000);
	    WebElement adnwpjct = driver.findElement(By.id("approver:j_idt186"));
	    adnwpjct.click();
	    Thread.sleep(4000);
	    WebElement pjctcde = driver.findElement(By.id("approver:bcode"));
	    pjctcde.sendKeys("786");
	    Thread.sleep(4000);
	     WebElement app1 = driver.findElement(By.id("approver:name1_input"));
	     app1.sendKeys("vishwas244@hopon.co.in");
	     List<WebElement> alloptions = driver.findElements(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all']"));
	      String  Expectedvalue="vishwas244@hopon.co.in";
	     for (WebElement opp : alloptions) {
	    	String text = opp.getText();
	    	 if(text.equalsIgnoreCase( Expectedvalue))
	    		 opp.click();
	    	   Thread.sleep(4000);
	    WebElement sappname = driver.findElement(By.id("approver:name2_input"));
	    sappname.sendKeys("qdtfg");
	    Thread.sleep(4000);
	   
	    WebElement Adbttn = driver.findElement(By.id("approver:j_idt216"));
	    Adbttn.click();
	    
	    
	     //driver.close();
	     }
	     }
	     
     }
	