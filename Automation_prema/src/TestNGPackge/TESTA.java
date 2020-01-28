package TestNGPackge;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TESTA extends BaseTestNg {
	
	@Test(invocationCount=2)
	public void testA1() {
	//System.out.println("t111111111111");
		Reporter.log("A11111",true);
	}
	
	@Test
	public void testA2() {
	//System.out.println("t111111111111");
		Reporter.log("A2222",true);
	}
	
}