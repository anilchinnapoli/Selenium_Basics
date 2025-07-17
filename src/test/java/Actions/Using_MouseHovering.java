package Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_MouseHovering {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver =new EdgeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to the appln
			driver.get("https://www.amazon.in/");
			
	   //Performing Mouse Hovering
			

	}

}
