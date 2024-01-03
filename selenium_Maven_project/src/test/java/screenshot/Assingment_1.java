package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assingment_1 {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com");
		
		// capturescreenshot
		
	TakesScreenshot ts = (TakesScreenshot) driver;
	File ab = ts.getScreenshotAs(OutputType.FILE);
	File cd = new File("../selenium_Maven_project/screenshot2//makemytrip.png");
	FileHandler.copy(ab, cd);
	
	}

	
	}


