package extent_reports;

import org.testng.annotations.Test;

import Base_test.Base_test4;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Report_001 extends Base_test4 {
  @Test(priority = 1)
  public void verify_skill()  {
	  
	  // to search automation 
	  driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']")).sendKeys("Automation testing");
	  
	  
	  driver.findElement(By.xpath("//div[@title='Automation testing']")).click();
	  // to click on experience dropdown
	  
	  driver.findElement(By.xpath("//input[@name='expereinceDD']")).click();
	  // to select 2 years 
	  driver.findElement(By.xpath("//ul[@class='dropdown ']/li[3]")).click();
	  
	  // entre location 
	  // entre search button 
	 
	  
  }
  @Test(priority = 2)
  public void f() {
	  
  }
 
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

 
  
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void invoke_browser() {
	  launch("Chrome");
	  navigate("https://www.naukri.com/");
	  
  }

}
