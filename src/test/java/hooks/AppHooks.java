package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {
	
	
	@Before("@campaignfeature")
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	
//	@Before(order = 2)
//	public void beforeHookSecond()
//	{
//		System.out.println("Before hook 2");
//	}
	
	@After("@functional")
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}
	
//	@After(order = 2)
//	public void afterHookSecond()
//	{
//		System.out.println("After hook 2");
//	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before step is executing");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("After step is executing");
	}


}
