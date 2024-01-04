package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest_01 {
  @Test(priority = 2,enabled = false)   // annotation parameter for sequence to run 
  public void f() {
	  System.out.println("Test_01 from new test");
  }
  @Test(priority = 1)
  public void r () {
	  System.out.println("Test-02 from new test");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method from new test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After methods from new test");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test from new test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test from new test");
  }

}
