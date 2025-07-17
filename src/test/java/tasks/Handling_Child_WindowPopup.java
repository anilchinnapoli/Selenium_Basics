package tasks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Child_WindowPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the Screen
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Navigate to appln
		driver.get("https://shoppersstack.com/");
		
		Thread.sleep(3000);
		
		//Create a object for Action Class
		Actions act = new Actions(driver);
		
	    //Find the element and select the categories in it
	    WebElement kids =driver.findElement(By.xpath("//a[.='Electronic']"));
	    
	    act.moveToElement(kids).perform();
		
	    Thread.sleep(3000);
	    
	    //Click on Element
		driver.findElement(By.xpath("//a[.='USB Cables & Accessories']")).click();
		
		
		driver.findElement(By.xpath("//span[.='oral b']")).click();
		
		//Fetch the parent WindowID and Store it
		String pwid = driver.getWindowHandle();
		//System.out.println(pwid);
		
		//Click on Compare Button
		driver.findElement(By.xpath("//*[name()='svg'][@data-testid=\"InfoOutlinedIcon\"]")).click();
		
		
		Set<String> wids = driver.getWindowHandles();
		
		for(String s : wids) {
			
			driver.switchTo().window(s);
			String url = driver.getCurrentUrl();
			//if(url.contains("https://www.amazon.in/")) {
				break;
			}
		}
		
		//driver.manage().window().maximize();
		
		// DownCast driver to TakeScreenShot
		//TakesScreenshot ts = (TakesScreenshot)driver;
		
		//Take Screen Shot and Store it in Temporary File
		//File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Store it in Permanent File
	//	File d = new File ("./Src/Amazon.png");
		
		//Using FileUtils
	//	FileUtils.copyFile(src, d);
		
		
		//driver.quit();
		
	}
//}
