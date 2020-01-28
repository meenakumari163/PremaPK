package Admindashboard1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ManageApprovers extends Baseclass{

  public static void main(String[] args) throws InterruptedException {
  driver.get("https://hopon.co.in/corp/pages/settings/manage-approvers.xhtml#");
  Thread.sleep(2000);
  driver.manage().window().maximize();
  WebElement un = driver.findElement(By.id("tab:Name"));
  un.sendKeys("vishwas23@gmail.com");
  Thread.sleep(2000);
  WebElement pwd = driver.findElement(By.id("tab:Password"));
  pwd.sendKeys("123");
  Thread.sleep(2000);
  WebElement lgnbtn = driver.findElement(By.id("tab:signin"));
  lgnbtn.click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@href='/corp/pages/settings/manage-approvers.xhtml']")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@id='approver:j_idt188']")).click();
  driver.findElement(By.xpath("//input[@id='approver:bcode']")).sendKeys("123");
  Thread.sleep(2000);
  WebElement App1 = driver.findElement(By.xpath("//input[@id='approver:name1_input']"));
  App1.sendKeys("Vishwas");
  Thread.sleep(2000);
  
  WebElement Appname = App1.findElement(By.xpath("//ul[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']"));
  Thread.sleep(2000);
  Appname.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all ui-state-highlight'][1]")).click();
  Thread.sleep(2000);
  
  WebElement App2 = driver.findElement(By.xpath("//input[@id='approver:name2_input']"));
  App2.sendKeys("Kishore-saiki191@gmail.com");
  Thread.sleep(2000);
  WebElement intmtr = driver.findElement(By.xpath("//input[@id='approver:intimatename_input']"));
  intmtr.sendKeys("Prema-prema794@hopon.co.in");
  Thread.sleep(2000);
  driver.findElement(By.xpath("//a[@id='approver:j_idt218']")).click();
  WebElement txt = driver.findElement(By.xpath("//table[@id='approverTableForm:approverTab'][@class='table table-bordered table-striped']//tbody[1]//tr//td[1]"));
  String text = txt.getText();
  System.out.println(text);
  
  }

}
