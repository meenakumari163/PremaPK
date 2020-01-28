package qsp;

import java.util.Set;

public class Demoprgm30ChildBrowserpopup  extends Demoprgm3 {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
		String ParentwindowHandle = driver.getWindowHandle();
		System.out.println( ParentwindowHandle);
		Set<String> AllwindowHandles = driver.getWindowHandles();
		int count = AllwindowHandles.size();
		System.out.println(count);
		for( String wh:AllwindowHandles) {
			//driver.switchTo().window(wh);
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(wh + "........>"+title);
			if(!wh.equals(ParentwindowHandle))
				Thread.sleep(3000);
			    driver.close();
			   
			
		}

	}

}
