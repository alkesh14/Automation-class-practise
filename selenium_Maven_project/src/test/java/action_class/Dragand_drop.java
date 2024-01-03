package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragand_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		//locate frame
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement sourc1 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement source2 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement source3 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement target4=driver.findElement(By.cssSelector("div#trash"));
		
		Actions act = new Actions(driver);
		// act.dragAndDrop(source, target);
		act.clickAndHold(source).moveToElement(target4).release().build().perform();
		act.clickAndHold(sourc1).moveToElement(target4).release().build().perform();
		act.clickAndHold(source2).moveToElement(target4).release().build().perform();
		act.clickAndHold(source3).moveToElement(target4).release().build().perform();
	

	}



	}


