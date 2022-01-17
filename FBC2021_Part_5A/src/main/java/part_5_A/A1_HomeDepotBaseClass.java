package part_5_A;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A1_HomeDepotBaseClass {

	public WebDriver driver;
  @BeforeTest
  @Parameters({"webURL"})
  public void beforeTest(String webURL) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/skynet/Documents/eclipse-workspace/FinalBootCamp2021/drivers/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(webURL);
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
