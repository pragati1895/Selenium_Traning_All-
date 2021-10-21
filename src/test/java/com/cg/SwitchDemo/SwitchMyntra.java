package com.cg.SwitchDemo;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchMyntra {
	 WebDriver driver;
	 public SwitchMyntra(){
	 	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
	 	driver=new ChromeDriver();
	 	driver.get("https://www.myntra.com/");
	 	driver.manage().window().maximize();
	 }
	    public void getTitle()
	 {
	 	System.out.println(driver.getTitle());
	 	System.out.println(driver.getCurrentUrl());
	 }
	    
	  public void switchtab() {
		WebElement mens= driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a"));
		mens.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		
		ArrayList<String> list= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
	  }  
	  public void womens() {
		 WebElement wmens=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[2]/div/a"));
		  wmens.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
		  ArrayList<String> array= new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(array.get(2));
	  }
	  public void Kdis() {
			 WebElement wmens=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
			  wmens.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
			  ArrayList<String> array1= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(array1.get(3));
		  }
	  public void HomeAndLeaving() {
			 WebElement wmens=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/a"));
			  wmens.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
			  ArrayList<String> array2= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(array2.get(4));
		  }

	  public void Buty() {
			 WebElement wmens=driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[5]/div/a"));
			  wmens.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
			  ArrayList<String> array3= new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(array3.get(5));
		  }
	  public void closede() {
		  driver.close();
	  }
	  public void quite() {
		  driver.quit();
	  }
}
