package testpakageIPL;

import org.testng.annotations.Test;

public class TestLogin  extends baseclass{
	
	@Test
	public void testLgin() {
		driver.get("http://demo.actitime.com/login.do");
		
		LoginPage lp=new LoginPage(driver);
		//enter the username
		lp.setUsername("admin");
		
		//enter the password
		lp.setPassword("manager");
		
		//click on login btn
		lp.clickLogin();

}
}