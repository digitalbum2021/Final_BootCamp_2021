package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpediaHome {
	
	public static WebDriver driver;
	
	//@FindBy() WebElement id;
	@FindBy (xpath="(//span[@class='uitk-tab-text'])[2]") WebElement flightTab;
	
	@FindBy (xpath="//button[@aria-label='Leaving from']") WebElement origin;
	@FindBy (xpath="//*[@id='location-field-leg1-origin']") WebElement originTextBox;
	
	@FindBy (xpath="//button[@aria-label='Going to']") WebElement destination;
	@FindBy (xpath="//*[@id='location-field-leg1-destination']") WebElement destinationTextBox;
	
	@FindBy (xpath="//button[@id='d1-btn']") WebElement depDateBox;
	@FindBy (xpath="//button[@aria-label='Feb 1, 2022']") WebElement depDate;
	
	@FindBy (xpath="//button[@id='d2-btn']") WebElement retDateBox;
	@FindBy (xpath="//button[@aria-label='Feb 28, 2022']") WebElement retDate;
	
	@FindBy (xpath="//button[@data-stid='apply-date-picker']") WebElement applyDate;
	
	@FindBy (xpath="//button[@data-testid='submit-button']") WebElement searchButton;


	public ExpediaHome(WebDriver driver) {
		ExpediaHome.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectFlights() throws InterruptedException {
		flightTab.click();
		Thread.sleep(2000);
	}
	
	public void selectOrigin(String airport) throws InterruptedException {
		origin.click();
		Thread.sleep(2000);
		originTextBox.sendKeys(airport,Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void selectDest(String airport) throws InterruptedException {
		destination.click();
		Thread.sleep(2000);
		destinationTextBox.sendKeys(airport,Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void selectDepDate() throws InterruptedException {
		depDateBox.click();
		Thread.sleep(2000);
		depDate.click();
		Thread.sleep(2000);
		retDate.click();
		Thread.sleep(2000);
		applyDate.click();
		Thread.sleep(2000);
	}
	
	public void clickSearch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", searchButton);
	}

}
