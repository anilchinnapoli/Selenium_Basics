package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Child_Window_Popup {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Navigate to appln
		driver.get("https://www.flipkart.com/");
		
		//Identify search bar
		driver.findElement(By.name("q")).sendKeys("Toys");
		
		//Identify Search icon and Click
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		//Fetch the ParentWindowId and Store it
		String pwid =driver.getWindowHandle();
		System.out.println(pwid); 
		
		//Click on Element 
		driver.findElement(By.xpath("//a[contains(.,'ARIZON')]")).click();
		
		Set<String> wids = driver.getWindowHandles();
		Thread.sleep(3000);
		//
		for (String s : wids) {
			
		driver.switchTo().window(s);
		
		if(driver.getTitle().contains("ARIZON DIY Plastic Building Blocks for Kids 100+ pcs - DIY Plastic Building Blocks for Kids 100+ pcs . Buy  Any toys in India. shop for  ARIZON products in India. | Flipkart.com")){
				
		   Thread.sleep(3000);
				
		   driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		
		}
		
        //Switch back to parent Window
		driver.switchTo().window(pwid);
		Thread.sleep(3000);
		
		driver.quit();
	
		
	}
}
	
}