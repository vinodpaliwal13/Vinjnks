package org.ui.maps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singleselectpage {
	
	
	@FindBy(id="franchiseeId")
	public WebElement franchiseeId;
	
	
	
	
	
	

	public Singleselectpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
}
