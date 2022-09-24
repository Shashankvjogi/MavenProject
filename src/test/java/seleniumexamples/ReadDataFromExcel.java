package seleniumexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Shashank\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		String filePath="//C://Users//user-pc//Downloads";
		String fileName="Book2.xlsx";
		String sheetName="Sheet1";
		

	    File file = new File(filePath+"\\"+fileName);

	    

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook workBook = null;

	   
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	   

	    if(fileExtensionName.equals(".xlsx")){

	   
	    	workBook = new XSSFWorkbook(inputStream);

	    }

	    
	    else if(fileExtensionName.equals(".xls")){

	       
	    	workBook = new XSSFWorkbook(inputStream);

	    }

	   

	    Sheet sheet = workBook.getSheet(sheetName);

	   

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);

	    
	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	           
	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	            if( j==0) {
	            	driver.findElement(By.id("email")).sendKeys(row.getCell(j).getStringCellValue());
	            } if(j==1){
	            	driver.findElement(By.id("pass")).sendKeys(row.getCell(j).getStringCellValue());	
	            }
	            
	             
	        }
	        
	        System.out.println();
	    } 
	  
	    driver.findElement(By.xpath("//button[@value='1']")).click();   
	       
	}	
}
