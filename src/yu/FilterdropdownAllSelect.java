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

public class FilterdropdownAllSelect {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = Driver.getdriver();		
		
		driver.get("https://qamsa2.franconnectqa.net/fc");
		
		
//		driver.findElement(By.xpath("//input[@name='user_id']")).click();
//		driver.findElement(By.xpath("//input[@name='user_id']")).clear();
		
		driver.findElement(By.xpath("//input[@name='user_id']")).sendKeys("adm");
				
				
				
		driver.findElement(By.id("password")).sendKeys("t0n1ght");
		
		driver.findElement(By.xpath("//button[@id='ulogin']")).click();
		
		/*driver.findElement(By.xpath("//span[text()='The Hub']")).click(); 
		
		driver.findElement(By.xpath("//span[text()='The Hub']/../following-sibling::ul/li[7]/a[text()='Tasks']")).click(); 
		
		
		driver.findElement(By.xpath("//a[text()='Add Task']")).click();
		
		
	
		
		
		VinAllMethods v= new VinAllMethods();
		
		
		//v.singleSelect(driver, "MAY");
		
		v.mulSelect(driver, " Alex Petrus");
		
		
		
		
		*/
		
		
		
		
		
		
		driver.findElement(By.xpath("//div[@class='admin_setting-icon svg-icon']")).click();
		driver.findElement(By.xpath("//a[@href='#Inspection_Management']/span[text()='Field Ops']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul/li[3]/a[text()='Question Library']")).click();
		
		
		List<String> genderList = new ArrayList<String>();
		List<WebElement> el = driver.findElements(By.xpath("//tr/td[1][@class='botBorder colPadding']"));
	
		
		int size = el.size();
		
		for(WebElement s: el) {
			
			String t = s.getText();
			System.out.println(t);
			
			genderList.add(s.getText());
			
			
		}
		
		
		
		
		
		
		List<String> mstatusList = new ArrayList<String>();
		
		List<WebElement> el1 = driver.findElements(By.xpath("//select[@id='categoryID']/option/following-sibling::option"));
		
		
		
		
		int size1=el1.size();
		
		
		for(WebElement s1: el1) {
			
			
			String t2 = s1.getText();
			System.out.println( t2);
			
			
			mstatusList.add(s1.getText());
			}
			
			
		
		
		if(mstatusList.containsAll(genderList)) {
			System.out.println("matching all text ");
			
			System.out.println(genderList + "***");
			System.out.println(mstatusList + "***");
		}
	
	
	
	
	


		
		
		
		
		
		
		
		
	
	

}}
