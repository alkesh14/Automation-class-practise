package verify_functionality;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class User_session extends Base_class {
  @Test
  public void do_login() {
	  ap.open_broweser("chromebrowser");
	  ap.navigate("reddifurl");
	  
	  System.out.println("do_login");
  }
  @Test
  public void do_logout() {
	  System.out.println("do_logout");
	  
  }
}
