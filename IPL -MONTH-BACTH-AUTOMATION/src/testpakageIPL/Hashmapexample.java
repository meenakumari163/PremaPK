package testpakageIPL;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Hashmapexample extends baseclass{

	public static void main(String[] args) {
		
		driver.get("file:///C:/Users/Dell/Desktop/Multiplebox.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select  s = new Select(list);
		List<WebElement> allElements = s.getOptions();

		HashMap<String, Integer> hashMapObj = new HashMap<String, Integer>();
		for (WebElement element : allElements) {
			String text = element.getText();
			if (hashMapObj.containsKey(text)) {
				Integer value = hashMapObj.get(text);
				value++;
				hashMapObj.put(text, value);
			}else{
				hashMapObj.put(text, 1);
			}
		}
		Set<String> allKeys = hashMapObj.keySet();	
		for (String key : allKeys) {
			Integer value = hashMapObj.get(key);
			System.out.println(key +" -->"+ value);
			
			if (value>1) {
				System.out.println("Occurance of " + key + " is :" + value);
}	
}
		
}
}