package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class USingXpath {

	public static void main(String[] args) {
		
		//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//MAximize the webpage
		driver.manage().window().maximize();
		
		//NAvigate to the  appln
	   driver.get("https://demowebshop.tricentis.com/");
	   
	   //IDentify the 
	   //driver.findElements(By.xpath"(./html/body/div[4]/div[1]/div[1]/div[3]/form/input[1]"))

	}

}
