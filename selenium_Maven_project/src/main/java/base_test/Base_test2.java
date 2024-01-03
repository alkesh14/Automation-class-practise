package base_test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;

public class Base_test2 {
	
	public static  WebDriver driver;
	 
	public static  void  takescreenshot(String screenshotname) throws IOException {
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File Trg= new File("../selenium_Maven_project/screenshot2/" +screenshotname+ ".png");
		FileHandler.copy(src, Trg);
		
	}
	public static void Launch (String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notification");
			driver = new ChromeDriver(option);
			
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("--disable-notification");
			driver=new FirefoxDriver(option); 
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("open browser is :-"+browser);
	}
	public static void navigate(String url) {
		driver.get(url);
		System.out.println("current URL is :-"+url);
		System.out.println("title of weboage is :-"+driver.getTitle());
			
			
	}
	
	

	}

