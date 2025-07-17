package PopUps;


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

public class HAndlingFileUpload_UsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException{
		
		//LAunch the Browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the Screen
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Select the file and copy the file to clipboard
		StringSelection str =new StringSelection("C:\\Users\\anilc\\OneDrive\\Attachments\\Desktop\\anil_resume1.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		//Navigate to appln
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//Identify choose file button
		WebElement upload = driver.findElement(By.id("file-upload"));
		
		//Click on Choose file button using action class
		Actions act = new Actions(driver);
		act.moveToElement(upload).click(upload).build().perform();
		
		Thread.sleep(3000);
		//Paste the file using control +v and click on enter
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		//driver.quit();

	}

}
