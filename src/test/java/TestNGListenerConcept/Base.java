package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {	
	static WebDriver driver;

public static void Intitalization() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
}
public void Failed() throws IOException {
File	f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File f2= new File("C:\\AutomationSelenium\\SeleniumFirstProject\\ScreenShots\\testFaliure.jpg");
FileUtils.copyDirectory(f1, f2);
	
}
}


