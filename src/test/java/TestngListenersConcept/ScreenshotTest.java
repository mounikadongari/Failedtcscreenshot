package TestngListenersConcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	
	@Test
	public void takeScreenshotTest() {
		Assert.assertEquals(true, true);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
