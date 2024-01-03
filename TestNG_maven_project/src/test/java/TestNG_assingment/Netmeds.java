package TestNG_assingment;

import org.testng.annotations.Test;

import Base_test.Base_test4;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Netmeds extends Base_test4 {
	Actions act;
  @Test(priority = 1)
  public void mouse_hover_01() throws Throwable {
	  act= new Actions(driver);
	  
	  // to hover mouse on wellness
	  Thread.sleep(4000);
	  act.moveToElement(driver.findElement(By.xpath("(//a[text()='Beauty'])[1]"))).build().perform();
	  
	  // to take screenshot
	  takesscreenshot("beauty netmeds");
	  
  }
  @Test(priority = 2)
  public void search_medicine() throws Throwable {
	 act = new Actions(driver);
	 // to search medicine 
	 act.moveToElement(driver.findElement(By.xpath("//input[@id='search']"))).click().sendKeys("zincold").build().perform();
	 act.keyDown(Keys.ENTER).build().perform();
	 // to capture name of medicine 
	 WebElement medicine = driver.findElement(By.xpath("(//span[@class='clsgetname'])[4]"));
	 // to capture name of medicine 
	 System.out.println("name of medicine is :-" +medicine.getText() );
	 
	 // capture ss of expexted page 
	 takesscreenshot("expected page");
  }
  @Test(priority = 3)
  public void  select_medicine() throws InterruptedException {
	  // to scroll down 
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy (0,130)");
	  //  add to cart
	  driver.findElement(By.xpath("(//form[@class='cart-form'])[4]/button")).click();
	  
	  
	 
	  
  }
  
  
  @BeforeClass
  public void launch_browser() {
	  // to launch broweser 
	  launch("chrome");
	  
	  // navigate URL
	  
	  navigate("https://www.netmeds.com/");
	  //  will get launch broweser title and url of page 
  }

  @AfterClass
  public void afterClass() {
  }

}
