package verify_functionality;

import org.testng.annotations.Test;

import functionality.Application_functionality;
import functionality.Validation_functionality;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
 public class Base_class {
	 
	 public Application_functionality ap;

  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
			  
	  System.out.println("before method");
  }

  @BeforeTest
  public void beforeTest() throws Exception {
	  ap= new Application_functionality();
	  System.out.println("before test");
  }

}
