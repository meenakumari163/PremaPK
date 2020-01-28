package TestNGPackge;

//import org.junit.Test;
//import org.junit.runners.Parameterized.Parameters;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dataparameterdemo {
    @Parameters({"city","area"})
	@Test
	public void  testParamreters( String city,String area) {
	Reporter.log(city+":"+area,true);
	

}
}