package org.ExcelMethod;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadWrite {
	
	
	
//public  void main(String[] args) throws EncryptedDocumentException, IOException {
		
	@Test
	public void ValueRetrn() throws EncryptedDocumentException, IOException {
	
		
		System.setProperty("webdriver.chrome.driver","C://workspace//VIN//exe//chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();		
	//	 driver.get("https://qamsa1.franconnectqa.net/fc/");
		 
		 ExcelMethod cm=new ExcelMethod();
		String rtnValue = cm.readData("Sheet1", 2,2);
		 
		 
		
		 
		 driver.get("https://www.google.com/");
		 driver.findElement(By.xpath("//input[@id='horus-querytext']")).sendKeys(rtnValue);
		 
		 
		 
	//}
		 
	
	}

}
