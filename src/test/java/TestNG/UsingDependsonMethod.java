package TestNG;

import org.testng.annotations.Test;

public class UsingDependsonMethod {

	@Test(dependsOnMethods = "register",groups="smoke")
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void register() {
		System.out.println("register");
	}
	
	@Test(dependsOnMethods = "login")
	public void create() {
		System.out.println("create");
	}
}
