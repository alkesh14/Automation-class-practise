package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_001 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//driver.get("https://www.flipkart.com");
		
		
		
		// recquirment  to click on searchbox 
		
		 driver.findElement(By.id("twotabsearchtextbox")).click();
		 
		
		


	}

}
