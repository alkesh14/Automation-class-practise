package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_001 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		// locate frame by index
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(null));
		
		// to come out of frame after working on frame
		
		driver.switchTo().defaultContent();
		
		// to enter anopther frame 
		driver.switchTo().frame(1);
		
	driver.findElement(By.xpath(null));
	
	driver.switchTo().defaultContent();
		
	}
}
