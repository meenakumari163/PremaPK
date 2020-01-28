package testpakageIPL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sortedlistbox extends baseclass {

	public static void main(String[] args) {
		

		driver.get("file:///C:/Users/Dell/Desktop/Multiplebox.html");
		WebElement listele = driver.findElement(By.id("mtr"));
		
		 Select s=new Select(listele);
		 List<WebElement> options = s.getOptions();
			int size = options.size();
			System.out.println("The number of elements present inside the listbox:"+size);
			
			ArrayList<String> list = new ArrayList<String>();
			for(WebElement WE: options) {
			String text = WE.getText();
			System.out.println(text);
			list.add(text);
		} 
			Collections.sort(list);
			System.out.println("-----print the value in sorted order----");
			for (String value : list) {
				System.out.println(value); 
	}


	}

}
