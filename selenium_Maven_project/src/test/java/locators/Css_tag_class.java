package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_tag_class {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.amazon.in");
		 
		 // to click on sign in start here
		 //css tag and class ( tagname.class value)
		 
		 
		 driver.findElement(By.cssSelector("a.sign-in-tooltip-link")).click();
		 

	}

}
