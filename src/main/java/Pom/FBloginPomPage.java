package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginPomPage {

	// Declaration
	@FindBy(xpath = "//h2")
	private WebElement header;

	@FindBy(name = "email")
	private WebElement UN;

	@FindBy(id = "pass")
	private WebElement pswd;

	@FindBy(name = "login")
	private WebElement login;

	// Initialization
	public FBloginPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public WebElement getheader() {
		return header;
	}

	public WebElement getUN() {
		return UN;
	}

	public WebElement getpswd() {
		return pswd;
	}

	public WebElement getlogin() {
		return login;
	}

}
