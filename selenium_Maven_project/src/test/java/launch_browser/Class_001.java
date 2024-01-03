package launch_browser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_001 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jeevansathi.com");
		
		
	}

}
