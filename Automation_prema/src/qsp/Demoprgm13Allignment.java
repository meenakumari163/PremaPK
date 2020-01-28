package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demoprgm13Allignment extends Demoprgm3 {

	public static void main(String[] args) {
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		int usernmeXcordinate = username.getLocation().getX();
		System.out.println("username x co- ordinate"+ usernmeXcordinate);
		
		
		int width = username.getSize().getWidth();
	   System.out.println("username width" +  width);
	   
	   int height = username.getSize().getHeight();
	   System.out.println(" username height" + height);
	  
	   
	   
	   WebElement password = driver.findElement(By.name("pwd"));
	   int passwordXcordinate = password.getLocation().getX();
	   System.out.println("password X co-ordinate"+ passwordXcordinate);
	   
	   int width2 = password.getSize().getWidth();
	   System.out.println(" password width" + width2  );
	   
	   
	   int height2 = password.getSize().getHeight();
	   System.out.println("password height"+  height2);
	   
	   if(usernmeXcordinate==passwordXcordinate && width==width2 && height==height2 )
	   { 
		   System.out.println(" both  username  and password text boxes are allighned");
		   
	   }
	   else {
		   System.out.println("not allighned");
	   }

	}

}
