package DataProviders;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Using_DataProviders {

	
	@DataProvider
	public Object[][] data() {
		
		Object [][] obj = new Object[2][2];
		
		
		obj[0][0]="abc@123";
		obj[0][1]="cba@321";
		
		obj[1][0]="ani@420";
		obj[1][1]="ina@024";
		
		return obj;
	}
	
	  
	@Test(dataProvider="data")
	public void Test(String un,String pswd){
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys(un);
		
		driver.findElement(By.name("pass")).sendKeys(pswd);
		
		driver.findElement(By.name("login")).click();
		
		driver.quit();
		
	//	System.out.println(un+pswd);
		
	}
}

