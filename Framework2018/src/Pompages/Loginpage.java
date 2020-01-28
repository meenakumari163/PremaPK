package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//declare elements
		@FindBy(id="username")
		WebElement unTB;
		@FindBy(name="pwd")
		WebElement pwdTB;
		@FindBy(xpath="//div[.='Login ']")
		WebElement loginbtn;
		
		//Initializes the elements 
		   public Loginpage(WebDriver driver) {
		   PageFactory.initElements(driver, this);   
	   }
	    //utilize the elements
		   public void setUsername(String username) {
		   unTB.sendKeys(username);
		   }
		public void setPassWord(String st2) {
			pwdTB.sendKeys(st2);
			
		}
		public void clickLogin() {
			loginbtn.click();
			
		}	
				
	}


