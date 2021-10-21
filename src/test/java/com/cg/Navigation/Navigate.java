package com.cg.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	WebDriver driver;
	public Navigate(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	   public void getTitle()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

	public void getSearchText() 
	{
		 WebElement search=driver.findElement(By.name("q"));
		 search.sendKeys("Capgemini India");
		 search.submit();
		 
	}
	
	public void moveBack() {
		driver.navigate().back();
	}
	public void moveForword() {
		driver.navigate().forward();
	}
	public void moveRefresh() {
		driver.navigate().refresh();
	}
}

