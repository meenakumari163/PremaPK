package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demoprgm34SelectMultipleSelectListBox extends Demoprgm3  {

	public static void main(String[] args) {
		
		driver.get("file:///C:/Users/Dell/Desktop/Multiplebox.html");
		WebElement fooditemlist = driver.findElement(By.id("mtr"));
		Select s = new Select(fooditemlist);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("Poori");
		boolean multiple = s.isMultiple();
		System.out.println( multiple);
		List<WebElement> allelement = s.getOptions();
		int cnt =  allelement.size();
		System.out.println(cnt); 
		for(WebElement food : allelement){
			String text = food.getText();
			System.out.println(text);
		}
		System.out.println("*****Print all Selected food items******");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println( allSelectedOptions.size());
		for (WebElement selectedItem : allSelectedOptions) {
			String text1 = selectedItem.getText();
			System.out.println(text1);
		}
		
		
		s.deselectAll();
		System.out.println("******print first selected item ********");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
		//s.deselectByIndex(0);
		//System.out.println("*****Print first selected food item*******");
		//WebElement firstSelectedOption2 = s.getFirstSelectedOption();
		//System.out.println(firstSelectedOption2.getText());
		
		
		//s.deselectByVisibleText("Poori");
		//System.out.println("*****Print first selected food item*******");
		//WebElement firstSelectedOption3 = s.getFirstSelectedOption();
		//System.out.println(firstSelectedOption3.getText());
		
		driver.close();
	
		
		
		
		
	
		
	
		
	
		
		
			
		
		
		
		

	}

}
