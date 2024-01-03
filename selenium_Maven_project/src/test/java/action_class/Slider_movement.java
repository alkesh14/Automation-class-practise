package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_movement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/slider/");
		
		
		//locate frame 
		WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		// to locate slider 
		WebElement slider =driver.findElement(By.id("slider"));
		Actions act= new Actions(driver);
		
		// move in foorward directions method 1
		//act.dragAndDropBy(slider, 100, 0).build().perform();
		
		// move in forward direction method 2
		
		act.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
		// move in backword direction
		
	act.clickAndHold(slider).moveByOffset(-100, 0).release().build().perform();
	}

}
