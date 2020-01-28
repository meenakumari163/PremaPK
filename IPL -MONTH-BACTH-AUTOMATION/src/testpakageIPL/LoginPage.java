package testpakageIPL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declare elements
	@FindBy(id="username")
	WebElement unTB;
	@FindBy(name="pwd")
	WebElement pwdTB;
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginbtn;
	
	//Initializes the elements 
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
   //utilise elements 
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}	
	
		public void setPassword(String pwd) {
			pwdTB.sendKeys(pwd);
	}
		
	public void clickLogin() {
		loginbtn.click();
    }
			
}
	
	
	


