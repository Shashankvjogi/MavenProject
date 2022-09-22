package seleniumexamples;
//Write HRM Login using XPATH for all the fields
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search  {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		Search obj=new Search();	// class object
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		
		obj.search("Admin",driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); //CLICKING ON CLEAR BUTTON
		obj.search("Admin","Paul Collings",driver);	
		
	}
	 void search(String username,WebDriver d) throws InterruptedException {
		
		// WebDriver driver = new ChromeDriver();
		d.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		d.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

	}
	 void search(String role,String Employeename,WebDriver d) throws InterruptedException {
			
			// WebDriver driver = new ChromeDriver();
		 WebElement r= d.findElement(By.className("oxd-select-text oxd-select-text--active"));
			Select select=new Select(r);
			select.selectByVisibleText("Admin");
		    d.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
//			d.findElement(By.xpath("//button[@type='submit']")).click();


		}
	 

}
