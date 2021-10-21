package com.cg.Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtabledata {
//	int col1;
//int  row;
	WebDriver driver;
public webtabledata(){
System.setProperty("webdriver.chrome.driver","C:\\Users\\PLENDGHA\\Documents\\chromedriver.exe");
driver=new ChromeDriver();

	 	driver.get("http://demo.guru99.com/test/web-table-element.php");
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 	}
	 public void handleWebtable() {
//	WebElement	 col=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr"));
//	col.getSize();
//	WebElement Row=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[26]"));
//		 col1.size();
//		 row.size();
//		 for(int i=1;i<col.getSize();i++) {
//			 for(j=1;j<row.size();j++) {
//				 
//			 }
//		 }
//	 }
	
	
	 boolean found=false;
     WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']"));
     List<WebElement> rows=table.findElements(By.tagName("tr"));
     int rownum=rows.size();
     System.out.println(" rows: "+ rownum);
     List<WebElement> cols=rows.get(0).findElements(By.tagName("th"));
     int colnum=cols.size();
     System.out.println("cols: "+colnum);
    
     for(WebElement we:rows) {
        
         if(we.getText().contains("HDIL")) {
             List<WebElement> columns=we.findElements(By.tagName("td"));
             String s=columns.get(3).getText();
             System.out.println("current price: "+s);
             found=true;
             break;
         }
       
     }
     if(!found) {
         driver.navigate().refresh();
         handleWebtable();
     }
	
 }

}
