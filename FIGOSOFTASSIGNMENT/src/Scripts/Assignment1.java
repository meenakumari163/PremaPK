package Scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTest;
import Generic.Lib;
import Pompages.Loginpage1;

public class Assignment1 extends BaseTest {
	
	@Test
public void ASSIMNT1() throws InterruptedException {
	
	Loginpage1 lp=new Loginpage1(driver);
	String username = Lib.getCellValue(EXCEL_PATH,"ValidLogin",1,0);
	lp.setUsername(username);
	 Thread.sleep(3000);
	 
	 String st2 = Lib.getCellValue(EXCEL_PATH,"ValidLogin",1,1);
	/* double st1 = Lib.getIntvalue(EXCEL_PATH,"ValidLogin",1,1);
	 int a=(int) st1;
	 String st2= Integer.toString(a);*/
	 lp.setPassWord1(st2);
	 Thread.sleep(3000);
	  
     lp.clickLogin();
	
     WebDriverWait wait=new WebDriverWait(driver,30);
	 wait.until(ExpectedConditions.titleIs("Amazon.in"));
	
	
	SoftAssert s= new SoftAssert();
    s.assertEquals(driver.getTitle(),"Amazon.in");
    s.assertAll();
	
    }


}

