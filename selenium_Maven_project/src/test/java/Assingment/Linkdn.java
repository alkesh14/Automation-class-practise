package Assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import base_test.Base_test;

public class Linkdn extends Base_test {

	public static void main(String[] args) throws Throwable {
		launch("chrome");
		navigate("https://in.linkedin.com/");

		Actions act = new Actions(driver);
		// to entre mail id

		act.moveToElement(driver.findElement(By.xpath("//input[@autocomplete='username']"))).click()
				.sendKeys("alkeshjiwtode@gmail.com").build().perform();
         // to slecet mail id 
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// to copy selected mail id
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// to press tab to switch to password

		act.keyDown(Keys.TAB).build().perform();
		// to paste

		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		// take ss 
		takesscreenshot("linkdn");
	}

}
