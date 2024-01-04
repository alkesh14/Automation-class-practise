package TestNG_assingment;

import org.testng.annotations.Test;

import Base_test.Base_test4;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Meesho extends Base_test4{
	Actions act;
  @Test
  public void mouse_hover_001() {
	  act=new Actions(driver);
	 // to hover mouse at women tab
	  act.moveToElement(driver.findElement(By.xpath("//span[text()='Women Ethnic']"))).build().perform();
	  
  }
  @Test
  public void mouse_hover_02() {
	  act= new Actions(driver);
	  // to hover mouse at men tab
	  act.moveToElement(driver.findElement(By.xpath("//span[text()='Men']"))).build().perform();
	  
  }
  @Test
  public void mouse_hover_03() {
	  act= new Actions(driver);
	  // to hover mouse at home&kitchen
	  act.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Kitchen']"))).build().perform();
	  
  }
  @BeforeMethod
  public void launch_broweser() {
	  launch("chrome");
	  navigate("https://www.meesho.com/");
	  
  }

  @AfterMethod
  public void Ending_process() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
