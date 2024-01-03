package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import base_test.Base_test;

public class Amazon_automate extends Base_test {

	public static void main(String[] args) throws Throwable {
		launch("chrome");
		
		navigate("https://www.amazon.in");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// to click on element 
		driver.findElement(By.linkText("Amazon miniTV")).click();
		// to take screenshot
		takesscreenshot("amazon mini tv");
		
		// to go back
	//js.executeScript("window.history.back()");  // by javascriptexecutor 
		driver.navigate().back();   // by navigate method of webdriver
		// to click on 2nd element 
		driver.findElement(By.xpath("//a[text()='Sell']")).click();
		
		// to take screenshot 
		takesscreenshot("sell section");
		
		// to click on amazon logo
		
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		// to entre the text in search box 
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.click();
		searchbox.sendKeys("mobile");
		
		// to take screenshot
		takesscreenshot("searchbox");
		// to click on search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		// to scroll page to bottom
		 
		 js.executeScript("window.scrollBy (0,document.body.scrollHeight)");
		 
		 // take ss 
		 takesscreenshot("scroll to bottom");
	 
	

	}

}
