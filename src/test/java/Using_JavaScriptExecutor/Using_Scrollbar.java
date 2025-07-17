package Using_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class Using_Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Browser
		WebDriver driver = new EdgeDriver();
				
		//Maximize the Window
		driver.manage().window().maximize();
				
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//Navigate to appln
		driver.get("https://www.amazon.in/");
				
		//Handle the Scroll Bar Using Hard Coded Coordinates
		
		//DownCasting the driver reference variable
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1000)");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile"+Keys.ENTER);
		
		//Scroll the WebPage  using Element Coordinates
		
		WebElement camera = driver.findElement(By.xpath("//span[text()='Camera Modes']"));
//		int x_axis= camera.getLocation().getX();
//		int y_axis= camera.getLocation().getY();
//		
//		js.executeScript("window.scrollBy("+x_axis+","+y_axis+")");
//		
		Thread.sleep(5000);
		
		//Scroll the WebPage using element reference
		js.executeScript("arguments[0].scrollIntoView(true)", camera);
		
		Thread.sleep(3000);
		
		//Scroll the WebPage till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		//Scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		driver.quit();
				

	}

}
