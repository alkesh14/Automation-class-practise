package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {

	public static void main(String[] args) {
		// webdriver megthods

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com"); // this is use to hit url in browser

		driver.getTitle(); // this will capture titile of webpage by webdriver

		driver.getCurrentUrl(); // this will capture url of cuurent webpage opened

		driver.getPageSource(); // this will capture html source code opened by webdriver

		driver.findElement(By.id(null)); // this is used to identify webelement on webpage by locators

		driver.findElements(By.className(null)); // for multiple web element

		driver.close(); // to close browser/web application open by webdriver

		driver.quit(); // this used to close all windows opened by webdriver

		driver.getWindowHandle(); // whenever webdriver launches any window , it assign unique id to
									// every window. we can capture it by this menthod

		driver.getWindowHandles(); // for multiple windows

		driver.switchTo().frame(0); // this will switch from one tab to another tab
		
		driver.navigate();  //  this use to navigate url. or to go back and forward or refresh page
		
		driver.manage();  // used for maximize,minimize ,wait addition ,size setting etc .
		
		
		
		

	}

}
