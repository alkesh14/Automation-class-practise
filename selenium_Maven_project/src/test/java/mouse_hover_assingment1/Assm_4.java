package mouse_hover_assingment1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assm_4 {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Amazon miniTV"))).build().perform();
		
		// screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ab = ts.getScreenshotAs(OutputType.FILE);
		File cd = new File("../selenium_Maven_project/mousehover screenshot/Assm4.png");
		FileHandler.copy(ab, cd);
		
		


	}

}
