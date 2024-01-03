package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_002linktext {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		// locator linktext
		
		// driver.findElement(By.linkText("Amazon miniTV")).click();
		
		// css locattor tagname#idvalue
	    
		// driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		
		// css locator tagname.classnamevalue
		driver.findElement(By.cssSelector(null));
	}

}
