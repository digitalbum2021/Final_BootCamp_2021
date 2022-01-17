package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZHome {
	
	public static WebDriver driver;
	
	@FindBy (xpath="//*[@id='twotabsearchtextbox']") WebElement searchBox;
	@FindBy (xpath="//input[@id='nav-search-submit-button']") WebElement searchButton;
	@FindBy (xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[3]") WebElement myItem;
	
	public AMZHome(WebDriver driver) {
		AMZHome.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchText(String itemName) throws InterruptedException {
		Thread.sleep(2000);
		searchBox.sendKeys(itemName);
		Thread.sleep(2000);
	}

	public void clickSearch() throws InterruptedException {
		searchButton.click();
		Thread.sleep(2000);
	}
}
