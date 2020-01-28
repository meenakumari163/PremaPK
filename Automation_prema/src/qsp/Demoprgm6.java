package qsp;

public class Demoprgm6 extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {

		driver.get("https:\\www.facebook.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https:\\google.com");
		Thread.sleep(20000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();

		
		}

}