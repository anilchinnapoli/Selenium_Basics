package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UsinfSoftAssert {
	
	@Test
	public void Url(){
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
	   
			String acturl = driver.getCurrentUrl();
			
		    String expurl = "https://www.facebook.";
		    
		   SoftAssert soft =new SoftAssert();
		   
		   soft.assertEquals(acturl, expurl);
		   
		   soft.assertNotNull(expurl);
		   
		  soft.assertTrue(acturl.contains(expurl));
		  
		  driver.quit();
		  
		  soft.assertAll();
	}

}
