package base_test;

import java.io.File;
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

public class Base_test {

	public static WebDriver driver;

	public static void takesscreenshot(String screenshotname) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("../selenium_Maven_project/screenshots/" + screenshotname + ".png");
		FileHandler.copy(src, target);

	}

	public static void launch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver = new ChromeDriver(option);

		
		}else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option= new FirefoxOptions();
			option.addArguments("--disable-notifications");
			
			driver=new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("launch browser is :-"+browser);
	}
	public static void navigate(String url) {
		driver.get(url);
		System.out.println("Navigate url is :-"+url);
		
		System.out.println("Title of webpage is :-"+driver.getTitle());
		
	}

}