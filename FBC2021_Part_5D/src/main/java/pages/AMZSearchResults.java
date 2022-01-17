package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZSearchResults {
	
	public static WebDriver driver;
	
	@FindBy (xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[3]") WebElement item1;
	
	public AMZSearchResults(WebDriver driver) {
		AMZSearchResults.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectItem() throws InterruptedException {
		Thread.sleep(2000);
		item1.click();
	}
	
}
