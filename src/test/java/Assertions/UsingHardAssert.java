package Assertions;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {

	@Test
	public void url() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		// Validate the title of the webpage

		@Nullable
		String acttitle = driver.getTitle();
		
		String exptitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";

		Assert.assertEquals(acttitle, exptitle);
		
		Assert.assertTrue(acttitle.contains(exptitle));
		
		Assert.assertNotNull(exptitle);
		
		//Assert.assertNull(exptitle);
		
		//Assert.fail();
		
		
		driver.quit(); 
		
		
	}
}
