package com.cg.project;

import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Regrestration {
WebDriver driver;
public Regrestration() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	LogEntries logEntries = driver.manage().logs().get("browser");
	for (LogEntry entry : logEntries) {
	System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	String errorLogType= entry.getLevel().toString();
	String errorLog= entry.getMessage().toString();
	if(errorLog.contains("404")){
	System.out.println("Error LogType: "+ errorLogType+" Error Log message: "+errorLog);
	}
	}
	
}
	
public void FandName() {
	
	WebElement Fname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	Fname.sendKeys("pragati");
	WebElement Lname=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	Lname.sendKeys("Lendghar");
}
public void AddressField() {
	WebElement address=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
	address.sendKeys("Chakan Ranubai Mala, Z.P.SchoolBehnind,Tal-Khed, Dist-Pune");
}
public void EmailField() {
	WebElement email=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
	email.sendKeys("lendgharp117@gmail.com");
}
public void PhoneNoField() {
	 WebElement phone=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
	phone.sendKeys("9049490958");
}
public void GenderRadioButton() {
	 WebElement gender=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
	gender.isSelected();
}
public void Hobiess() {
	WebElement hobb=driver.findElement(By.xpath("//input[@id='checkbox2']"));
	hobb.isSelected();
}
public void Gender() {
WebElement  gcheckbox=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
gcheckbox.isSelected();
gcheckbox.click();

}

public void Hobs() {
	WebElement  hob=driver.findElement(By.xpath("//input[@id='checkbox1']"));
	hob.isSelected();
	hob.click();
}
public void language() {
	Actions act =new Actions(driver);
	 WebElement lan=driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
	 act.moveToElement(lan).click().build().perform();
  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[2]/ul/li[1]")).click();
  act.moveToElement(lan).click().build().perform();
}

public void skill() {
	WebElement staticdropdown= driver.findElement(By.id("Skills"));
	Select s= new Select(staticdropdown);
	s.selectByIndex(3);
	System.out.println(s.getFirstSelectedOption().getText());
}


public void country() {
	WebElement staticcountry=driver.findElement(By.id("countries"));
	Select s1= new Select(staticcountry);
	s1.selectByIndex(3);
	System.out.println(s1.getFirstSelectedOption().getText());
}
public void Scountry() {
WebElement sc	=driver.findElement(By.id("country"));
Select s2= new Select(sc);
s2.selectByIndex(4);
System.out.println(s2.getFirstSelectedOption().getText());
}
public void AllDOB() {
	WebElement year=driver.findElement(By.id("yearbox"));
	Select s3=new Select(year);
	s3.selectByVisibleText("1995");
	System.out.println(s3.getFirstSelectedOption().getText());
	WebElement month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	Select s4=new Select(month);
	s4.selectByVisibleText("July");
	System.out.println(s4.getFirstSelectedOption().getText());
	WebElement day=driver.findElement(By.id("daybox"));
	Select s5=new Select(day);
	s5.selectByVisibleText("18");
	System.out.println(s5.getFirstSelectedOption().getText());
}
public void password() {
	driver.findElement(By.id("firstpassword")).sendKeys("pL#hipl@2023");
	
}
public void Cpassword() {
	driver.findElement(By.id("secondpassword")).sendKeys("pL#hipl@2023");
}
public void Submit() {
	driver.findElement(By.id("submitbtn")).click();
}
public void closed1() {
	driver.quit();
}


}
