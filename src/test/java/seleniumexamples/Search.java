package seleniumexamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Search  {
	 WebDriver driver = new ChromeDriver();

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		
		Search obj=new Search();	
		
		obj.login();
			
		obj.search("Admin");
		Thread.sleep(3000);
		obj.search("Admin","Paul Collings");	
		
	}
	
	void login() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
	}
	 void search(String username) throws InterruptedException {
		
		// WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); //CLICKING ON CLEAR BUTTON
		

	}
	 void search(String role,String Employeename) throws InterruptedException {
			
			// WebDriver driver = new ChromeDriver();
//		 WebElement r= d.findElement(By.className("oxd-select-text oxd-select-text--active"));
//			Select select=new Select(r);
//			select.selectByVisibleText("Admin");
		 	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div")).sendKeys(role);
		    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			//form/div/div/div[2]/div/div[2]
		}
	 

}
