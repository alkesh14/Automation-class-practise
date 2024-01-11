package functionality;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generic_functionality  {
public String project_path=System.getProperty("user.dir");
	
	public Properties envprop;
	public Properties uatprop;
	public Properties locatorprop;
	public FileInputStream fis;
	public WebDriver driver;
	

	public void open_broweser(String browser) {
		System.out.println("launched browser is :-"+ uatprop.getProperty(browser));
		if(uatprop.getProperty(browser).equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();			
		}else if (uatprop.getProperty(browser).equalsIgnoreCase("firfox")) {
			driver=new FirefoxDriver();
		}else if (uatprop.getProperty(browser).equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void navigate(String url) {
		driver.get(uatprop.getProperty(url));

	}

	public void click(String locator) {
		get_Element(locator);
	}

	public void get_text() { // no need for argument we will use it after click and other function to get
								// text directly

	}

	public void select(String locator, String option) {

	}

	public void type(String locator, String Input_Text) { // to send text input

	}
	public WebElement get_Element(String locatorkey) {
		WebElement element =null;
		driver.findElement(getLocator(locatorkey));
		return element ;
	}
	public By getLocator(String locatorkey){
		By by=null;
		if (locatorkey.endsWith("_id")) {
			By.id(locatorprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_name")) {
			By.name(locatorprop.getProperty(locatorkey));
			
		}else if (locatorkey.endsWith("_classname")) {
			By.className(locatorprop.getProperty(locatorkey));
		
		}else if (locatorkey.endsWith("_xpath")) {
			By.xpath(locatorprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("cssselector")) {
			By.cssSelector(locatorprop.getProperty(locatorkey));
		}else if (locatorkey.endsWith("_partiallinktext")) {
			By.partialLinkText(locatorprop.getProperty(locatorkey));
			 
		}
		return by;
		
	}
}
