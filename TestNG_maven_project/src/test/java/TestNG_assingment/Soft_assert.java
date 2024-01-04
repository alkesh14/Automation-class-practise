package TestNG_assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base_test.Base_test4;

public class Soft_assert extends Base_test4 {
  @Test
  public void Verify_url() {
	  String expected_url ="https://www.amazon.in/";
	   String Actual_url= driver.getCurrentUrl();
	   
	   System.out.println("The current url is :-" +Actual_url);
	   
	   // verify by soft assert 
	   SoftAssert sa = new SoftAssert();
	   sa.assertEquals(Actual_url, expected_url);
	   // either  condition pass or fail in soft assert it will perform next operation 
	   
	   //type text 
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	   
	   // if want info about false condition of assert  it will show test failed but execution will complete
	   // on web application like find mobile 
	   //sa.assertAll();
  }
	  @BeforeSuite
	  public void beforesuit() {
		  launch("chrome");
		  navigate("https://www.amazon.in/");
		  
	  }
	  @AfterSuite
	  public void aftersuit() {
		  
	  }
  


	
}
