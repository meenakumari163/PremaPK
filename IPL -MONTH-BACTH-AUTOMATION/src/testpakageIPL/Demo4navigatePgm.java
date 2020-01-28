package testpakageIPL;

public class Demo4navigatePgm extends baseclass{

	public static void main(String[] args) throws InterruptedException {
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.navigate().to("https://www.google.com");
		 
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();

		driver.close();
		

	}

}
