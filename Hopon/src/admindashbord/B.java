package admindashbord;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {

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
	    driver.findElement(By.id("approver:name1_input")).sendKeys("vishwas");
	    Thread.sleep(4000);
	    List<WebElement> alloptions= driver.findElements(By.xpath("//li[contains(text(),'vis')]"));
        String Expectedvalue="Vishwas J-vishwas244@hopon.co.in"; 
	    for (WebElement option : alloptions) {
	    String text=  option.getText();
	    if(text.equalsIgnoreCase(Expectedvalue)) {
	    option.click();
	    WebElement sappname = driver.findElement(By.id("approver:name2_input"));
	    sappname.sendKeys("qdtfg");
	    Thread.sleep(4000);
	    WebElement Adbttn = driver.findElement(By.id("approver:j_idt216"));
	    Adbttn.click();
	}
}

}}
