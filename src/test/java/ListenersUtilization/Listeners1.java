package ListenersUtilization;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasicClassUtility.BaseClass;
@Listeners(ListenersUtility.Listeners.class)
public class Listeners1 extends  BaseClass{
	
	@Test
	public void demo() {
		System.out.println("scenario");
	}

}
