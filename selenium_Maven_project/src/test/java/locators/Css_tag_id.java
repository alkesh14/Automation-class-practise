package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_tag_id {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		// css Tag & id ("Tag#id")
		
		// to find amazon logo
	driver.findElement(By.cssSelector("a#nav-logo-sprites")).click();
	
	// to find and click on all menu

	driver.findElement(By.cssSelector("a#nav-hamburger-menu")).click();
	}

}
