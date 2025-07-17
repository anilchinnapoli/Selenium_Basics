package tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchthedatafromExcel_tologin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//Convert the physical file to java file
		FileInputStream fis = new FileInputStream("./src/test/resources/Profile.xlsx");
		
		//Fetch the WorkBook
		Workbook wb = WorkbookFactory.create(fis);
		
		//Fetch the Sheet
		Sheet sh = wb.getSheet("Profile");
		
		//Call all the Sheet values
		String d = sh.getRow(0).getCell(1).toString();
		String d1 = sh.getRow(1).getCell(1).toString();
		String d2 = sh.getRow(2).getCell(1).toString();
		String d3 = sh.getRow(3).getCell(1).toString();
		
		System.out.println(d + d1 + d2 + d3);
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get(d3);
		//driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		//Fetch the TF of Name,Email,Pswd
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']"))
		.sendKeys(d);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(d1);
		
		driver.findElement(By.name("password")).sendKeys(d2);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[.='Register']")).click();
		
		driver.quit();
//		

	}

}
