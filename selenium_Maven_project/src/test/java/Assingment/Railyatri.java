package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base_test.Base_test;

public class Railyatri extends Base_test {

	public static void main(String[] args) throws Throwable {
		// to launch browser
		launch("chrome");

		// to navigate URL

		navigate("https://www.railyatri.in/");
		// to scroll down

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy (0,250)");
		WebElement from = driver.findElement(By.xpath("//input[@id='from_stn_input']"));
		from.click();
		from.sendKeys("nagpur");

		// to select nagpur from dynamic dropdown
		driver.findElement(By.xpath("//li[text()='NAGPUR | NGP']")).click();

		// to click on boarding to and write pune

		WebElement boarding_to = driver.findElement(By.xpath("//input[@id='to_stn_input']"));
		boarding_to.click();
		boarding_to.sendKeys("pune");

		// to select pune jn
		driver.findElement(By.xpath("//li[text()='PUNE JN | PUNE']")).click();

		// to click on date

		driver.findElement(By.xpath("//input[@id='datepicker_train']")).click();

		// to select date
		driver.findElement(By.xpath("//td[text()='15']")).click();

		// take screenshot after filling details
		takesscreenshot("details of trains");

		// to click on search button
		driver.findElement(By.xpath("//button[@id='search_btn_dweb']")).click();

		// to scroll down
		js.executeScript("window.scrollBy (0,100)");

		// to click on book now
		driver.findElement(By.xpath("(//div[@class='text-center book_now_btn book_tkt_now book_button_22142_3A'])[1]"))
				.click();

		// scroll down again
		js.executeScript("window.scrollBy (0,200)");

		// to click on pricwe and book now
		driver.findElement(By.xpath("(//button[text()='Book ₹1425'])[1]")).click();

		// to scroll down till passenger details

		js.executeScript("window.scrollBy (0,300)");

		// to fill full name of passenger
		WebElement passanger_name = driver.findElement(By.xpath("(//input[@class='inputText'])[1]"));
		passanger_name.click();
		Thread.sleep(3000);
		passanger_name.sendKeys("Alkesh Jiwtode");

		// to click on age and fill age
		WebElement age = driver.findElement(By.xpath("(//input[@class='inputText ageinput'])[1]"));
		age.click();
		Thread.sleep(2000);
		age.sendKeys("28");
		
		// screenshot 
		takesscreenshot("passenger details");
		// to click on save

		driver.findElement(By.xpath("//button[@class='save_psngr_btn']")).click();

		// scroll down
		js.executeScript("window.scrollBy (0,100)");

		// to enter email id
		driver.findElement(By.xpath("//input[@name='user_email']")).sendKeys("Alkeshjiwtode@gmail.com");
		// to enter phone no
		driver.findElement(By.xpath("//input[@name='phone_no']")).sendKeys("8411066660");

		// scroll down 
		js.executeScript("window.scrollBy (0,100)");
		
		// to enter IRCTC id 
		driver.findElement(By.xpath("//input[@class='idInput']")).sendKeys("maheshkhere11");
		
		
		// to click on verify 
		
		driver.findElement(By.xpath("//button[@class='verifyIdBtn']")).click();
		
		Thread.sleep(2000);
		// to click on continue button
		
		driver.findElement(By.xpath("//div[text()='Continue ']")).click();
		
		//to click on upi
		driver.findElement(By.xpath("//div[text()='UPI']")).click();
		
		//to entre UPI id

		driver.findElement(By.xpath("//input[@class='Bank_Name upi_vpa upi-link']")).sendKeys("8411066660@ybl");
	}
}

