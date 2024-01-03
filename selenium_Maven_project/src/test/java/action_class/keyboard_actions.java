package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_actions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.linkedin.com/");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("input#session_key"))).click().sendKeys("Alkesh jiwtode").build().perform();
		//press contro+a to select all
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		// to copu press control c 
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// to press tab to switch to password
		
		act.keyDown(Keys.TAB).build().perform();
		
		// to paste copied id 
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		// to scroll down
		
		//act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		act.keyDown(Keys.PAGE_DOWN).build().perform();	 
		
		
		
		

	}

}
