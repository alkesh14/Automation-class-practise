package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Invocation {
  @Test(invocationCount = 3)
  public void f() {
	  System.out.println("Test_01 from invocation");
  }
  
  // describtion in string format to describe test case    
  // enable parameter to skip execution of test
  @Test(description = "its a test case")
  public void g() {
	  System.out.println("test_02 from invocation");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test from invocation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test from invocation");
  }
  
@BeforeSuite
public void beforsuite() {
	System.out.println("before suite from invocation");
}
}
