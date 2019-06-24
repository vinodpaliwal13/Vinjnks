package yu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	
	public static WebDriver driver=null;



    public static WebDriver getdriver(){
    	
    	if (driver == null) {
    		 System.setProperty("webdriver.chrome.driver", "C:\\workspace\\VIN\\exe\\chromedriver.exe");
    	        driver=new ChromeDriver();
    		
    	}

        return driver;
        }
    

}
