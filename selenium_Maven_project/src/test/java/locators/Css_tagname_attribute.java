package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_tagname_attribute {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		
		// tag name and attribute  ("tagname[attribute=value]")
		// to click on electronics 	
		driver.findElement(By.cssSelector("a[data-csa-c-content-id=\"nav_cs_electronics\"]")).click();
	}

}
