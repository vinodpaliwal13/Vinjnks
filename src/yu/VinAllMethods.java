package yu;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VinAllMethods {
	
	
	public void singleSelect(WebDriver driver, String text) throws InterruptedException
	{
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame("cboxIframe");
//		driver.switchTo().fr
		
		//System.out.println(" reaching to the frame ");
		Thread.sleep(2000);
		//List<WebElement> element = driver.findElements(By.tagName("textarea"));   //("//*[@id='taskTable']/tbody/tr/td/div/table/tbody/tr[10]/td[2]/textarea")).sendKeys("dsfdsfsdfdfsfdfsdfsdf");
	//	System.out.println(element);
	//	driver.findElement(By.xpath("//*[@id=\"comments\"]")).sendKeys("sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsd");
		WebElement selEle = driver.findElement(By.xpath("//select[@name='franchiseeId']"));
		selEle.click();
		
		
		 List<WebElement> options = selEle.findElements(By.tagName("option"));
		
		 
		 int size = options.size();
		 
		Select s=new Select(selEle);
		
		
		for(int i=0; i<=size; i++)
		{
		
		
		s.selectByVisibleText(text);
		
		
		
		
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	//>>>>>>>>>>>>>>>>>>
	
	
	public void mulSelect(WebDriver driver, String text) throws InterruptedException
	{
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame("cboxIframe");
//		driver.switchTo().fr
		
		//System.out.println(" reaching to the frame ");
		Thread.sleep(2000);
		//List<WebElement> element = driver.findElements(By.tagName("textarea"));   //("//*[@id='taskTable']/tbody/tr/td/div/table/tbody/tr[10]/td[2]/textarea")).sendKeys("dsfdsfsdfdfsfdfsdfsdf");
	//	System.out.println(element);
	//	driver.findElement(By.xpath("//*[@id=\"comments\"]")).sendKeys("sdfsdfsdfsdfsdfsdfsdfsdfsdfsdfsd");
		 driver.findElement(By.xpath("//div[@id='ms-parentassignTo']/button/span[text()='Select']")).click();
		
		
		 driver.findElement(By.xpath("//div[@id='ms-parentassignTo']/button/span[text()='Select']/../following-sibling::div/div[1]/input[1]")).sendKeys(text);
		
		 driver.findElement(By.xpath("//div[@id='ms-parentassignTo']/button/span[text()='Select']/../following-sibling::div/div[1]/input[1]")).sendKeys(Keys.ENTER);
		 
		driver.findElement(By.id("selectAll")).click();
		
	
		
		
		
		
		
		
		
		
	}
	
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>  using select claaas
	
	
	
	
	
	
	
	
	
	
	
	public void mulSelectUsingSelelct(WebDriver driver, String text) throws InterruptedException
	{
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().frame("cboxIframe");
//		driver.switchTo().fr
		
		//System.out.println(" reaching to the frame ");
		Thread.sleep(2000);
		
		
	
//		WebElement element = driver.findElement(By.id("assignTo"));
//		Select select = new Select(element);
//		
//		List list = select.getOptions();
//		
//		String s =list.get(0).getTagName();
//		driver.findElement(By.cssSelector("[value='"+s+"'][id='selectItemassignTo']"));
//	
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='ms-parentassignTo']/button/span[text()='Select']/../following-sibling::div/ul/li"));
		//div[@id='ms-parentassignTo']/button/span[text()='Select']/../following-sibling::div/ul/li/label/input
		
		for (Iterator iterator = ele.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			if (webElement.getText().toLowerCase().contains("ALex")) {
				webElement.findElement(By.xpath("./label/input")).click();
			}
			
			
		}
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
