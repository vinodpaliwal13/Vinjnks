package yu;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Attach {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Driver.getdriver();		
		
		driver.get("https://qamsa2.franconnectqa.net/fc");
		
		
//		driver.findElement(By.xpath("//input[@name='user_id']")).click();
//		driver.findElement(By.xpath("//input[@name='user_id']")).clear();
		
		driver.findElement(By.xpath("//input[@name='user_id']")).sendKeys("adm");
				
				
				
		driver.findElement(By.id("password")).sendKeys("t0n1ght");
		
		driver.findElement(By.xpath("//button[@id='ulogin']")).click();
		
		
		
		
		driver.findElement(By.xpath("//div[@class='admin_setting-icon svg-icon']")).click();
		driver.findElement(By.xpath("//a[@href='#Inspection_Management']/span[text()='Field Ops']")).click();
		
		
		
		driver.findElement(By.xpath("//span[text()=' Manage media library & maintain attachments to be uploaded with questions. ']/../a")).click();
		driver.findElement(By.xpath("//span[text()=' Add Media']")).click();
		
		driver.findElement(By.xpath("//input[@id='mediaName']")).click();
		
		


		
		
		
		
		
		
		
		
	
	

}}
