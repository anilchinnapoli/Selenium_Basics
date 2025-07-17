package Using_JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatetoAnappln {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String url = "https://www.facebook.com/";
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//Navigate to an appln We Can Store and navigate or we can give 
		js.executeScript("window.location=arguments[0]", url);
		
		Thread.sleep(3000);
		
		//Fetch the url and title
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		
		//Fetch the Webpage
		js.executeScript("history.go(0)");
		Thread.sleep(3000);
		
		driver.quit();

	}

}
