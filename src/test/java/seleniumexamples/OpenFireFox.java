package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenFireFox {

	public static void main(String[] args)  {
		System.setProperty("webdriver.gecko.driver", "C:\\Shashank\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
