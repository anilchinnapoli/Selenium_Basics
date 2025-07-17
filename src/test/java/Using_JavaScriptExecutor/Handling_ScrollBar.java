package Using_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_ScrollBar {

	public static void main(String[] args) {
    
		//Launch the Browser
		WebDriver driver = new EdgeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to appln
		driver.get("https://www.amazon.in/");
		
		//Handle the Scroll Bar Using Hard Coded Coordinates
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(100,1000)");
		
	}

}
