package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_screenshot {

	public static void main(String[] args) throws IOException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		// TAKE SCREENSHOT 
		//TakesScreenshot ts = (TakesScreenshot) driver;
		// File ab =ts.getScreenshotAs(OutputType.FILE);
		 
		// File cx = new File("../selenium_Maven_project/screenshots/homepage01.png");
		//FileHandler.copy(ab, cx);
		
	//	TakesScreenshot ab=(TakesScreenshot) driver;
	//	File ax= ab.getScreenshotAs(OutputType.FILE);
	//	File cd=new File("../selenium_Maven_project/screenshots/home2.png");
	//	FileHandler.copy(ax, cd);

		TakesScreenshot ts=(TakesScreenshot) driver;
		File ab=ts.getScreenshotAs(OutputType.FILE);
		File cd=new File("../selenium_Maven_project/screenshots/1234.png");
		FileHandler.copy(ab, cd);
	}

}
