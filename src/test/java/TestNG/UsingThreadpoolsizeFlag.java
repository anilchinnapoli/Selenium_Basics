package TestNG;

import org.testng.annotations.Test;

public class UsingThreadpoolsizeFlag {

	@Test(priority = 2,groups="smoke")
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = 3)
	public void register() {
		System.out.println("Register");
	}
	
	@Test(threadPoolSize = 3,invocationCount = 3,priority = 1)
	public void create() {
		System.out.println("create");
	}
}
