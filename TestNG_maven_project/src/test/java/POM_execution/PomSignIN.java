package POM_execution;

import org.testng.annotations.Test;

import Base_test.Base_test4;
import POM.Sign_in_page;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PomSignIN extends Base_test4{
  @Test
  public void Verify_user_signin() {
	  
	  // to make has a relagtionship call method from sign in page  pom 
	  Sign_in_page sp= new Sign_in_page(driver);
	  sp.user_signin();
	  
  }
  @BeforeMethod
  public void Invoke_browser() {
	  launch("chrome");
	  navigate("http://www.automationpractice.pl/");
  }

  @AfterMethod
  public void afterMethod() {
  }

}
