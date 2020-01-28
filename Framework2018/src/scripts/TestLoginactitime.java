 package scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTestR;
import Generic.Lib1;
import Pompages.Loginpage;


public class TestLoginactitime extends BaseTestR {
	
	@Test
	public void testValidLogin() throws InterruptedException {
		
		Loginpage lp=new Loginpage(driver);
		String   username =Lib1.getCellValue(EXCEL_PATH, "ValidLogin",1,0);
	    lp.setUsername(username);
		
		 String st2 = Lib1.getCellValue(EXCEL_PATH,"ValidLogin",1,1);
		 
		 lp.setPassWord(st2);
		 Thread.sleep(3000);
		  
	     lp.clickLogin();
		
	    WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		
		
		SoftAssert s= new SoftAssert();
	    s.assertEquals(driver.getTitle(),"actiTIME - Enter Time-Track");
	    s.assertAll();
		
	    }
	
}
