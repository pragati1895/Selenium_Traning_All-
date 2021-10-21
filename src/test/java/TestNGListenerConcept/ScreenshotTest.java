package TestNGListenerConcept;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners(CustomListn.class)
public class ScreenshotTest extends Base {

	@BeforeMethod
	public void SetUp() {
		Intitalization();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void takeScreenshotAs() {
		Assert.assertEquals(false, true);
	}
}
