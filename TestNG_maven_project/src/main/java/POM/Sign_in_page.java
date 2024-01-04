package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_page {

	// web-elements locate 
	
	@FindBy(linkText = "Sign in") WebElement signbutton; 
	@FindBy(id = "email_create") WebElement useremail;
	@FindBy(id = "SubmitCreate") WebElement createaccount;
	
	// constructor  to initialize above variable with driver 
	public Sign_in_page (WebDriver driver) {
		
		// initialize web elemens which are  above 
		
		PageFactory.initElements(driver,this);  // if useing this it will reffer all current class instance variable if we mention this.button it reffer only one 
	}
	// operations perform 
	public void user_signin() {
		signbutton.click();
		useremail.sendKeys("abcd123@gmail.com");
		createaccount.click();
	}
	
}
