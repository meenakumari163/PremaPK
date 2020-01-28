package TestNGPackge;

import org.testng.annotations.Test;

public class DemoTestNg {
	
	@Test(priority=1)
	public void createuser() {
	System.out.println("createuser.....");

	}
	
	@Test(priority=2)
	public void editeuser() {
	System.out.println("editeuser....");

	}
	@Test(priority=3)
	public void deleteuser() {
	System.out.println("deleteuser.....");

	}

	
}
