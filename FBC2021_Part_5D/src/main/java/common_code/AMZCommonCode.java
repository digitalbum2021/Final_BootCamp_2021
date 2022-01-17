package common_code;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class AMZCommonCode {

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

	public void shots() throws IOException {
		Date dt = new Date();
		String strdate=dt.toString().replace(" ", "_").replace(":", "_");
		File cap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, new File ("/Users/skynet/Documents/eclipse-workspace/FBC2021_Part_5D/ScreenShots/"+strdate+".png"));
	}
}

