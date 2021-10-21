package com.cg.Framedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frametest {

	 WebDriver driver;
	 public frametest(){
	 	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
	 	driver=new ChromeDriver();
	 	driver.get("http://demo.guru99.com/selenium/deprecated.html");
	 	driver.manage().window().maximize();
	 }
	    public void getTitle()
	 {
	 	System.out.println(driver.getTitle());
	 	System.out.println(driver.getCurrentUrl());
	 }
	    public void ifram() throws InterruptedException {
	    
	    	driver.switchTo().frame("classFrame");
	    	driver.findElement(By.xpath("/html/body/div[4]/ul/li[5]")).click();
		 	Thread.sleep(3000);

	    }
	    
}
