package TestNG;

import org.testng.annotations.Test;

public class Depends_on_methods {
  @Test
  public void a() {
	  System.out.println("a () method ");
	  
  }
  @Test(dependsOnMethods = {"a"})
  public void b() {
	  System.out.println("b () method ");
	  
  }
   @Test(dependsOnMethods = {"c"})
  public void f() {
	  System.out.println("f method ");
	  
  }
  @Test(dependsOnMethods = {"b"})
  public void c() {
	  System.out.println("c () method ");
  }
}
