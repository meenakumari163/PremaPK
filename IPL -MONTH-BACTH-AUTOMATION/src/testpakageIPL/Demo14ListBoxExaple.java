package testpakageIPL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Demo14ListBoxExaple extends  baseclass{

	public static void main(String[] args) {
	
	driver.get("file:///C:/Users/Dell/Desktop/Multiplebox.html");
	WebElement list = driver.findElement(By.id("mtr"));
	
	 Select s=new Select(list);
	 s.selectByIndex(0);
	 s.selectByValue("v");
	 s.selectByVisibleText("Poori");
	 
	List<WebElement> options = s.getOptions();
	int size = options.size();
	System.out.println("The number of elements present inside the listbox:"+size);
	
	for(WebElement WE: options) {
	String text = WE.getText();
	System.out.println(text);
	 
	}
	 s.selectByIndex(0);
	 s.selectByValue("v");
	 s.selectByVisibleText("Poori");
	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	int size2 = allSelectedOptions.size();
	System.out.println("number of item  that is selected in list box:"+size2);
	
	for(WebElement WE2: allSelectedOptions ) {
	String text2 = WE2.getText();
    System.out.println( text2);
    }
	System.out.println("check whether it is a multiple select list box or not");
	boolean multiple = s.isMultiple();
	System.out.println(multiple+" yes, it is multi select");
	
	
	if( multiple) {
		
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	String text3 = firstSelectedOption.getText();
	System.out.println(text3+"is the first select item in the list box");
	
	s.deselectByIndex(0);
	
	WebElement firstSelectedOption1 = s.getFirstSelectedOption();
	String text4 = firstSelectedOption1.getText();
	System.out.println(text4+"is the first select item in the list box");
	
	
		
		
		
		
	}
	
	

	}

}
