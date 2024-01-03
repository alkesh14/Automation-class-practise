package TestNG_assingment;

import org.testng.annotations.Test;

import Base_test.Base_test4;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Flipcart extends Base_test4 {
	Actions act;
	@Test (priority = 1)
	public void close_popup () {
		WebElement pop_up = driver.findElement(By.xpath("//span[@role='button']"));
	if (pop_up.isDisplayed()) {
		pop_up.click();
	}
	}
		@Test	(priority = 2)
	
  public void search_shirt() {
	  // to search shirt in searchbox
	  
	  driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("shirts");
  
  }
		@Test(priority = 3)
		public void search() throws Throwable {
			// to click on search
			driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
			// take ss for searched product
			takesscreenshot("searched product");
			
		}
		@Test(priority = 4)
		public void select_shirt() {
			// to select shirt
			driver.findElement(By.xpath("(//a[@title='Men Regular Fit Solid Spread Collar Casual Shirt'])[1]")).click();
		}
		@Test(priority = 5)
		public void swtich_window() {
			
			// to switch to child window  
	 switch_window();  // from dynamic code 
	 driver.switchTo().window(child_window_id);
	// driver.switchTo().window(parent_window_id);
		}
		@Test(priority = 5)
		public void Add_to_cart() {
			// to scroll down 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy (0,1000)");
			// to click on add to cart
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			
		}
		
  @BeforeClass
  public void beforeClass() {
	  launch("chrome");
	  navigate("https://www.flipkart.com/");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
