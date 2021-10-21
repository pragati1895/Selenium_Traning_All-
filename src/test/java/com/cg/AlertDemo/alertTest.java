package com.cg.AlertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTest {
		 WebDriver driver;
		 public alertTest(){
		 	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
		 	driver=new ChromeDriver();
		 	driver.get("http://demo.automationtesting.in/Alerts.html");
		 	driver.manage().window().maximize();
		 }
		    public void getTitle()
		 {
		 	System.out.println(driver.getTitle());
		 	System.out.println(driver.getCurrentUrl());
		 }
		    public void getAlert() {
		    	 WebElement web=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button"));
		    	
		    	web.click();
		    	driver.switchTo().alert().getText();
		    	driver.switchTo().alert().accept();
		    	
		    	
		    }
		    public void alertAndOk() {
//		    	WebElement alert= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
//		    	alert.click();
//		    	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//		    	driver.switchTo().alert().getText();
//		    	driver.switchTo().alert().accept();
//		    	driver.switchTo().alert().getText();
//		    	driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
//		    	driver.switchTo().alert().dismiss();
//		    	System.out.println("cancel");
		    	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		    	driver.findElement(By.xpath("//div[@id='CancelTab']/button[@class='btn btn-primary']")).click();
		    	driver.switchTo().alert().accept();
		    	System.out.println("accept");
		    	driver.findElement(By.xpath("//div[@id='CancelTab']/button[@class='btn btn-primary']")).click();
		    	driver.switchTo().alert().dismiss();
		    	System.out.println("cancle");
		    	
		    }
		    
		    
}
