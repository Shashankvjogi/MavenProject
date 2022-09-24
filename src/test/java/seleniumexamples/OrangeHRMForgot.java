package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class OrangeHRMForgot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		String ini=driver.getTitle();
		
		driver.findElement(By.xpath("//body//div//form[@class='oxd-form']//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);

		String s=driver.getTitle();
		Assert.assertEquals(ini,s,"OrangeHRM");
		
		
		
		
	}}


