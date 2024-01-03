package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TNG_script {
	public WebDriver driver;
	
  @Test
  public void Verify_searchbox() {
	  // to locate and click searchbox
	  driver.findElement(By.xpath("//input[@placeholder='Try Saree, Kurti or Search by Product Code']")).sendKeys("watch");
	  
	  
	  
  }
  @BeforeMethod
  public void Launch_Browser () {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.get("https://www.meesho.com/");
	  System.out.println("title of webpage is ;-"+driver.getTitle());
	  
  }

  @AfterMethod
  public void Ending_process() throws InterruptedException {
	  Thread.sleep(3000);
	  // to close broweser 
	  driver.close();		
  }

}
