package common_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonCode {

	public WebDriver driver;
	public void selectBrowser(String browser) {

		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/skynet/Downloads/BootCamp-master/expedia/drivers/chromedriver");   
			driver=new ChromeDriver();    
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","/Users/skynet/Downloads/BootCamp-master/expedia/drivers/geckodriver");   
			driver=new FirefoxDriver(); 
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","/Users/skynet/Downloads/BootCamp-master/expedia/drivers/msedgedriver");   
			driver=new EdgeDriver();  
		}
		else {
			System.setProperty("webdriver.chrome.driver","/Users/skynet/Downloads/BootCamp-master/expedia/drivers/chromedriver");  
		}
	}

}

