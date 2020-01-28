package admindashbord;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cpompage {
//declare the elements
	@FindBy(id="tab:Name")
	WebElement unTB;
	@FindBy(id="tab:Password")
	WebElement pswdTB;
	@FindBy(id="tab:signin")
	WebElement lgnbtn;
	
	@FindBy(xpath="//a[@href='/corp/pages/super_admin/companyAdminTripsheet.xhtml']")
	WebElement trpfture;
	
	@FindBy(xpath="//input[@id='fromdt'][@class='startDate1']")
	WebElement fmdTB;
	@FindBy(xpath="//a[@class='dtpicker-button dtpicker-buttonSet']")
	WebElement setbtn;
	
	@FindBy(xpath="//input[@id='todt'][@class='endDate1']")
	WebElement todTB;
	@FindBy(xpath="//a[@class='dtpicker-button dtpicker-buttonSet']")
	WebElement  set2btn;
	
	@FindBy(id="daterangeForm:vendorCircle")
	WebElement venTB;
	
	@FindBy(xpath="//*[@id='daterangeForm:filters'][@name='daterangeForm:filters']")
	WebElement filTB;
	
	@FindBy(id="daterangeForm:filters")
	WebElement updtebtn;
	

    //Utilize elements
    public Cpompage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
     }
    
      public void setUsername(String un){
      unTB.sendKeys(un); }
      
      public void setPassword(String pd) {
      pswdTB.sendKeys(pd);}
         
      public void clickLogin() {
      lgnbtn.click();}
         
      public void clickTripSheet() {
      trpfture.click(); }
    
      public void fromDate() {
	  fmdTB.click(); }
      
      public void SetButton() {
	  setbtn.click(); }
     
      public void toDate() {
      todTB.click();	}
     
      public void SetButton2() {
      set2btn.click(); }
     
     public void venderlist(){
     Select s =new Select(venTB);
     s.selectByIndex(7);}
     
     public void filter(){
     Select s =new Select(filTB);
     s.selectByIndex(3);}
     
     public void updtebtn() {
     updtebtn.click();  }
    	 
}