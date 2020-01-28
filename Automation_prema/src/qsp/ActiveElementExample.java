package qsp;

public class ActiveElementExample  extends Demoprgm3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver.get("http://dell-pc/login.do");
		
		driver.switchTo().activeElement().sendKeys("admin");

	}

}
