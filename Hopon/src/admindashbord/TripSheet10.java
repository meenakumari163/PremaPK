package admindashbord;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TripSheet10 {
	
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	    
		    WebDriver driver= new  ChromeDriver();
		    driver.manage().window().maximize();
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
		    Thread.sleep(3000);
		    WebElement trip = driver.findElement(By.xpath("//a[@href='/corp/pages/super_admin/companyAdminTripsheet.xhtml']"));
		    trip.click();
		    Thread.sleep(3000);
		    WebElement from =   driver.findElement(By.id("fromdt"));
		    from.click();
		    Thread.sleep(3000);
		    WebElement set = driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']"));
		    set.click();
		    Thread.sleep(3000);
		    WebElement todate=   driver.findElement(By.id("todt"));
		    todate.click();
		    Thread.sleep(3000);
		    WebElement set2 = driver.findElement(By.xpath("//a[@class='dtpicker-button dtpicker-buttonSet']"));
		    set2.click();
		    Thread.sleep(3000);
		    WebElement list = driver.findElement(By.id("daterangeForm:vendorCircle"));
		    Select s= new Select(list);
		    s.selectByIndex(9);
		    WebElement name = driver.findElement(By.id("daterangeForm:fname_input"));
		    name.sendKeys("Prema kum");
		    
		    Thread.sleep(3000);
		    WebElement emp = name.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']"));
		    emp.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight']")).click();
		    Thread.sleep(3000);
		    WebElement bttn = driver.findElement(By.id("daterangeForm:j_idt274"));
		    bttn.click();
		   // driver.findElement(By.xpath("//div[@id='table_form:tableContainer']//td[1]")).click();
		    //driver.findElement(By.xpath("//div[@id='table_form:tableContainer']//td[1]//a[@id='table_form:tripsheet_table:0:j_idt279'][@href='#'][@class='ui-commandlink ui-widget btn primary']")).click();
		    //Thread.sleep(3000);
		   // String ttle = driver.getTitle();
		    //System.out.println(" The title is"+ttle);
		    }
}
