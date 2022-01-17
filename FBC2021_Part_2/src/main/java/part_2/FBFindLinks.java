package part_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBFindLinks {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/skynet/Documents/eclipse-workspace/FinalBootCamp2021/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		findLinks();
		quitBrowser();
		
	}
	
	public static void findLinks() {
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println("There are "+linkList.size()+" links.");
		
		for (int i=0; i<linkList.size(); i++) {
			
			System.out.println("this is link # "+i+" - "+linkList.get(i).getAttribute("href"));
			
		}
	}
	
	public static void quitBrowser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
