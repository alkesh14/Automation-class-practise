package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_001 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.amazon.in");

		// WebElement searchbox = driver.findElement(By.linkText("/amazon-coupons/b/?_encoding=UTF8&node=10465704031&ref_=nav_cs_coupons"));
		//searchbox.click();
		driver.quit();
	
	}

}
