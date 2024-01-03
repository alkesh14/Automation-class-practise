package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_method {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
	 Select s = new Select(driver.findElement(By.cssSelector("select[name=CompanyCountry]")));
	// s.selectByVisibleText("American Samoa");
		
	// s.selectByValue("AL");
	 s.selectByIndex(4);
System.out.println(s.isMultiple());	


	}

}
