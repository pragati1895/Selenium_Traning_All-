package com.cg.ActionsClassSDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClaa {

	WebDriver driver;
	 public ActionsClaa(){
	 	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
	 	driver=new ChromeDriver();

	 	driver.get("https://www.myntra.com/");
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 	}
	 
	    public void mouseOver() {
	    	 WebElement mens=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
	    	 
	    	 Actions action=new Actions(driver);
	    	 action.moveToElement(mens).perform();
	    	
	    	 
	    	}
	    
	    public void bugs() {
	    	WebElement b=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[14]/a"));
	    b.click();
	    }
	    public void bugclick() {
	    WebElement	bclick=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[1]/section/div/div[2]/ul/li[2]/label"));
	    bclick.isSelected();
	    bclick.click();
	   System.out.println(bclick.getText());
	    }
	    }

