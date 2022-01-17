package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZItemPage {
	
	public static WebDriver driver;
	
	@FindBy (xpath="//input[@id='add-to-cart-button']") WebElement addToCart;
	@FindBy (xpath="//input[@aria-labelledby='attachSiNoCoverage-announce']") WebElement noInsurance;
	@FindBy (xpath="(//input[@type='submit'])[17]") WebElement checkOut;
	
	public AMZItemPage(WebDriver driver) {
		AMZItemPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addItemToCart() throws InterruptedException {
		Thread.sleep(2000);
		addToCart.click();
		Thread.sleep(2000);
		if (noInsurance.isDisplayed()) {
			noInsurance.click();
		}
	}
	
	public void goToCart() throws InterruptedException {
		Thread.sleep(2000);
		checkOut.click();
	}
}
