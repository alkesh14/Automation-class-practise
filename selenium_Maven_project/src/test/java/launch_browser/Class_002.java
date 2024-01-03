package launch_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class_002 {

	public static void main(String[] args) {
		
		// launch browser 
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.metrorailnagpur.com");
		
		String ExpectedUrl="https://www.metrorailnagpur.com/";
		
		// to capture url of webapplication
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		// to check expected and actual url
		System.out.println(ExpectedUrl.equals(actualUrl));
		

	}

}
