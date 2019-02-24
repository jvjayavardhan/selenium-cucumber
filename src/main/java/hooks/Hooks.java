package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
	public static WebDriver driver;
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jvjay\\Desktop\\New folder\\selenium\\src\\main\\resources\\SupportingFiles\\chromedriver.exe");
		driver = new ChromeDriver();
	}
}
