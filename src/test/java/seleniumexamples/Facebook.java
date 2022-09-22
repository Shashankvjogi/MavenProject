package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805640%7Cb%7Cnew%20facebook%20account%7C&placement=&creative=550525805640&keyword=new%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-11078544207%26loc_physical_ms%3D20453%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeV6jjsK2bsjfDFErZiWJ7fgfysNcNI9NrUk2IbfOD-4YohTdCpPz2hoCp2kQAvD_BwE");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("firstname")).sendKeys("Shashank");
		driver.findElement(By.name("lastname")).sendKeys("jogi");
		driver.findElement(By.name("reg_email__")).sendKeys("shashankjogi111@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("jogi");
		driver.findElement(By.name("birthday_day")).sendKeys("12");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shashankjogi111@gmail.com");
		
		driver.findElement(By.name("birthday_month")).sendKeys("May");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");
		
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
//		driver.findElement(By.name("websubmit")).click();
	//input[@value='2']
	

		
	}

}
