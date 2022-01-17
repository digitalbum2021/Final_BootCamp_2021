package part_4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAllBrowser {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		chromeBrowser();
		Thread.sleep(5000);
		firefoxBrowser();
		Thread.sleep(5000);
		edgeBrowser();

	}

	public static void chromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/skynet/Documents/eclipse-workspace/FinalBootCamp2021/drivers/chromedriver");
		driver = new ChromeDriver();
		openWebsite("https://www.facebook.com");
		
	}

	public static void firefoxBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/skynet/Documents/eclipse-workspace/FinalBootCamp2021/drivers/geckodriver");
		driver = new FirefoxDriver();
		openWebsite("http://www.amazon.com");
	}

	public static void edgeBrowser() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "/Users/skynet/Documents/eclipse-workspace/FinalBootCamp2021/drivers/msedgedriver");
		driver = new EdgeDriver();
		openWebsite("https://www.homedepot.com");
	}

	public static void openWebsite(String webURL) throws InterruptedException {

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(webURL);
		Thread.sleep(5000);
		driver.quit();
	}
}
