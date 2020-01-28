package admindashbord;

import org.testng.annotations.Test;

public class Dactualpgm  extends Baseclass{
	@Test
	public void filterrides() throws InterruptedException {
	driver.get("https://mydev.co.in/corp/pages/signin.xhtml");
	driver.manage().window().maximize();
	Cpompage cp= new Cpompage(driver);
	cp.setUsername("c_admin@hopon.co.in");
	cp.setPassword("123");
	cp.clickLogin();
	Thread.sleep(3000);
	cp.clickTripSheet();
	Thread.sleep(3000);
	cp.fromDate();
	Thread.sleep(3000);
	cp.SetButton();
	Thread.sleep(3000);
	cp.toDate();
	Thread.sleep(3000);
	cp.SetButton2();
	Thread.sleep(3000);
	cp.venderlist();
	Thread.sleep(3000);
	cp.filter();
	Thread.sleep(3000);
	cp.updtebtn();
	}
}
