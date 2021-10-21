package com.cg.project;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomatiom {
 WebDriver driver;
public GoogleAutomatiom(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
}
   public void get()
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
public void clickOnImages()
{
	driver.findElement(By.linkText("Images")).click();
}

public void AlltheLinks() {
	System.out.println(driver.findElements(By.tagName("a")));
	//second senarion find the link
//	List<WebElement>list=driver.findElements(By.tagName("a"));
//	for(WebElement link1:list) 
//		System.out.println(link1.getText());
	
}

}
