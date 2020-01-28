package VALUELEAF;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewUIclickedtypedemo {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");

		    WebDriver driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://whistle.mobi/");
			Thread.sleep(500);
			driver.findElement(By.id("userid")).sendKeys("premakumari.d1@valueleaf.com");
			Thread.sleep(500);
			driver.findElement(By.id("password")).sendKeys("1");
			Thread.sleep(500);
			driver.findElement(By.xpath("//button[text()='Login']")).click();
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[text()='Campaign Execution']")).click();
			Thread.sleep(500);
			WebElement list1 = driver.findElement(By.xpath("//*[@id='category']"));
			list1.click();
			Thread.sleep(500);
			Select s1= new Select(list1);
			s1.selectByIndex(1);
			WebElement list2 = driver.findElement(By.xpath("//*[@id='brand_name']"));
			list2.click();
			Thread.sleep(500);
			Select s2= new Select(list2); 
			s2.selectByIndex(1);
			driver.findElement(By.xpath("//*[@id='campaign_group']")).sendKeys("sacx");
			Thread.sleep(500);
			driver.findElement(By.xpath("//*[@id='campaign_sub_group']")).sendKeys("cfdyf");
			Thread.sleep(500);
			WebElement list3 = driver.findElement(By.xpath("//*[@id='campaign_data']"));
			list3.click();
			Thread.sleep(500);
			Select s3= new Select(list3);
            s3.selectByIndex(2);
            Thread.sleep(500);
            driver.findElement(By.xpath("//*[@href='#c_c_category']")).click();
            Thread.sleep(500);
            /*for(int i1 = 1; i1<=16; i1++) 
   	        {
            WebElement list4 = driver.findElement(By.xpath("//*[@id='selectClickedCampaign']"));
			list4.click();
			Thread.sleep(1000);
			Select s4= new Select(list4); 
			s4.selectByIndex(i1);
			driver.findElement(By.xpath("//*[text()='×']")).click();
			Thread.sleep(300);
		    }*/
            WebElement list4 = driver.findElement(By.xpath("//*[@id='selectClickedCampaign']"));
			list4.click();
			Thread.sleep(1000);
			Select s4= new Select(list4);
			List<WebElement> ll = s4.getOptions();
			int sszz = ll.size();
			System.out.println("Total size of catogory:"+sszz);
			 for(int i1 =1; i1<sszz; i1++) 
	         {
	             String optionsValue = ll.get(i1).getText();
		         System.out.println("catogory name : "+i1+" is "+optionsValue);
		         s4.selectByIndex(i1);
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//*[@href='#cbrandname']")).click();
              Thread.sleep(1000);
              WebElement list5 = driver.findElement(By.xpath("//*[@id='selectCategoryBrand']"));
			  list5.click();
			  Select s5= new Select(list5);
			  List<WebElement> len = s5.getOptions();
			 
			  int length = len.size();
			  System.out.println("Total size of Brand available in "+optionsValue+" is: "+length);
			  for(int i2=1; i2<length; i2++)  
   	          {
              /*WebElement list6 = driver.findElement(By.xpath("//*[@id='selectCategoryBrand']"));
			  list6.click();
			  Thread.sleep(1000);
			  Select s6= new Select(list6);*/
			  s5.selectByIndex(i2);
			  Thread.sleep(2500);
			  driver.findElement(By.xpath("//*[@id='brand_name_list']//following::a[@class='delete'][1]")).click();
			  Thread.sleep(300);
		      }
			  driver.findElement(By.xpath("//*[@id='campaign_categories_list']//following::a[@class='delete'][1]")).click();
			  Thread.sleep(300);
			  driver.findElement(By.xpath("//*[@href='#c_c_category']")).click();
			  Thread.sleep(300);
		      }
            //driver.close();
      }
  
}