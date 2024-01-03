package TestNG_assingment;

import org.testng.annotations.Test;

import Base_test.Base_test4;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;


public class Hard_assert extends Base_test4 {
  @Test
  public void verify_link() {
	  String expected_link ="Amazon miniTV";
	   WebElement link= driver.findElement(By.linkText("Amazon miniTV"));
	   String Actual_link= link.getText();
	   System.out.println("Actual link is :-" +Actual_link);
	   
	   // verify expexted and actual link by hard assert 
	//   Assert.assertEquals(Actual_link, expected_link);
	   
	   // verify by hard asser 2nd way  assert
	   Assert.assertTrue(Actual_link.equals(expected_link),"Both links are not  same ");;
	   // assert input
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	   
	   // if expexted and actual result is true it will click searc box and find mobile else it willl give expection 
	   // it is called as abnormal termination if false condition in hard assert i:e if condtion false it not perfor next operation 
  }
  @BeforeSuite
  public void beforeSuite() {
	  launch("chrome");
	  navigate("https://www.amazon.in/");
  }

  @AfterSuite
  public void afterSuite() {
  }

}
