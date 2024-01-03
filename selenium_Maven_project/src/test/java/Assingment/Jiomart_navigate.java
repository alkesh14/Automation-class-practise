 package Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import base_test.Base_test;


public class Jiomart_navigate extends Base_test{
 
	    public static void main(String[] args) throws Throwable {
			
	    launch("chrome");
	    navigate("https://www.jiomart.com/");
	    
	    Actions act  = new Actions(driver);
	    
	    // element -1
	    WebElement element_1=driver.findElement(By.linkText("Groceries"));
	    // to hover mouse 
	    act.moveToElement(element_1).build().perform();
	   // to get name of current web element 
	    System.out.println("name of current web element is:-"+element_1.getText());
	    
	    // to take screenshot 
	    takesscreenshot("element-1");
	    Thread.sleep(3000); // to hold for 3 seconds 
	    
	    // element-2 
	    WebElement element_2=driver.findElement(By.linkText("Premium Fruits"));
	    // to hover mouse 
	    act.moveToElement(element_2).build().perform();
	    // to get name of current web element
	    System.out.println("name of current wwb elelment is :-"+element_2.getText());
	    
	    // to take screenshot
	    takesscreenshot("element_2");
	    
	    Thread.sleep(3000);  // to hold for 3 sec
	    
	    // element-3
	    WebElement element_3=driver.findElement(By.linkText("Home & Kitchen"));
	    // to hover mouse 
	    act.moveToElement(element_3).build().perform();
	    
	    // to capture name of element 
	    System.out.println("name of current web element is :-"+element_3.getText());
	    
	    // to take ss 
	    takesscreenshot("element_3");
	    
	    Thread.sleep(3000);  // to hold for 3 sec
	    // element-4
	    
	    // to locate web element 
	    WebElement element_4=driver.findElement(By.linkText("Fashion"));
	    // to hover mouse 
	    act.moveToElement(element_4).build().perform();
	    // to get name of current element 
	    System.out.println("name of current element is :-"+element_4.getText());
	    // to take ss 
	    takesscreenshot("element_4");
	    
	    Thread.sleep(3000); 
	    
	    WebElement element_5=driver.findElement(By.linkText("Electronics"));
	    
	    act.moveToElement(element_5).build().perform();
	    
	    System.out.println("name of current element is :-"+element_5.getText());
	    
	    // to take ss
	    
	    takesscreenshot("element_5");
	    
	    
	    Thread.sleep(3000);
	    
	    // element-6
	    
	    WebElement element_6=driver.findElement(By.linkText("Jewellery"));
	    
	    act.moveToElement(element_6).build().perform();
	    
	    System.out.println("name of current element is :-"+element_6.getText());
	    
	    // to take ss 
	    takesscreenshot("element_6");
	    
	    Thread.sleep(3000);
	    
	    
	    // element-7
	    WebElement element_7=driver.findElement(By.linkText("Beauty"));
	    // to hover 
	    act.moveToElement(element_7).build().perform();
	    // to  get name 
	    System.out.println("name of current element is :-"+element_7.getText());
	    // to take ss 
	    takesscreenshot("element_7");
	    
	    Thread.sleep(3000);
	    // element-8
	    WebElement element_8=driver.findElement(By.linkText("Home Improvement"));
	    act.moveToElement(element_8).build().perform();
	    System.out.println("name of current web element is:- "+element_8.getText());
	    // to take ss
	    takesscreenshot("element_8");
	    
	    Thread.sleep(3000);
	    
	    // element 9
	    WebElement element_9 = driver.findElement(By.linkText("Sports, Toys & Luggage"));
	    act.moveToElement(element_9).build().perform();
	    System.out.println("name of current web element is:- "+element_9.getText());
	    
	    // to locate searchbox
	    WebElement searchbox = driver.findElement(By.id("autocomplete-0-input"));
	    searchbox.sendKeys("choclates");
	    System.out.println("input present is searchbox is :-"+searchbox.getAttribute("value"));
	    act.keyDown(Keys.ENTER).build().perform();
	    
	    Thread.sleep(3000);
	    
	    // to click on munch and locate 
	    driver.findElement(By.xpath("(//div[@class='plp-card-foodtype'])[1]")).click();
	    
	    
	    // to scroll down page 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1700)");
	    
	    // take ss 
	    takesscreenshot("selected product");
	    Thread.sleep(1000);
	    
	    // add to cart much 
	    driver.findElement(By.xpath("(//button[@data-sku='491017990'])[1]")).click();
	    
	    // to go to cart
	    driver.findElement(By.xpath("(//button[@class='jm-btn primary medium jm-icon jm-border-none'])[2]")).click();
	    
	    // verify product in cart & take ss 
	    Thread.sleep(3000);
	    
	    takesscreenshot("product in cart");
	    // scroll down 
	    js.executeScript("window.scrollBy(0,1000)");

	    Thread.sleep(2000);
	    // to click on place order 
	    driver.findElement(By.xpath("(//button[@aria-label='button Place Order'])[1]")).click();
	    
	    // take screenshot of sign in page
	    
	    takesscreenshot("sign in page");
	    
	    
	    driver.findElement(By.xpath("//input[@id='loginfirst_mobileno']")).sendKeys("8411066660");
	    
	    
	    act.sendKeys(Keys.ENTER);
	    
	     
	    
	    
	    
	    
	    
		}
	      
	   

	}


