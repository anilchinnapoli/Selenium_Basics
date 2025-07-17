package tasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_fileUpload_UsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		//Launch the Browser
		WebDriver driver =new ChromeDriver();
		
		//MAximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//NAvigate to appln
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		//Select the File And Copy the file to ClipBoard
		StringSelection str =new StringSelection("C:\\Users\\anilc\\OneDrive\\Attachments\\Desktop\\anil_resume1.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
   
	    WebElement upload = driver.findElement(By.id("resume"));
	    
	    Thread.sleep(3000);
	    
	    // Click on Choose file Button by using Actions Class
	    Actions act = new Actions(driver);
	    act.moveToElement(upload).click(upload).build().perform();
	    
	    Thread.sleep(3000);
	    
	    //Perform Actions Of Control + V and Press on Enter
	    
	    Robot r = new Robot();
	    
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	     
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	    Thread.sleep(3000);
	    
	    //Close the Browser
	    driver.quit();
	    
	    
	    
	}
}
