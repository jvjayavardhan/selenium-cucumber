package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hooks.Hooks;

public class DemoPageObject extends Hooks{
	public static void launchURL(String url) {
		driver.get(url);
	}
	
	public static void searchText(String text) {
		driver.findElement(By.name("q")).sendKeys(text);;
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
}
