package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
		
		WebElement best =driver.findElement(By.linkText("Best Sellers"));
		//action class
		
		Actions at = new Actions(driver);
		//at.moveToElement(best).build().perform();
		
		// mouse hover 
		
		//at.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		at.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().sendKeys("abc").doubleClick().build().perform();
		
		

	}

}
