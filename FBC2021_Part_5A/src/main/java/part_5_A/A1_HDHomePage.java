package part_5_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class A1_HDHomePage {
	
	public static WebDriver driver;
	
	@FindBy (id="headerMyAccount") WebElement myAccount;
	@FindBy (id="SPSORegister") WebElement aRegister;

	public A1_HDHomePage(WebDriver driver) {
		A1_HDHomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyAccount() throws InterruptedException {
		myAccount.click();
		Thread.sleep(2000);
	}
	
	public void clickRegister() throws InterruptedException {
		aRegister.click();
		Thread.sleep(2000);
	}

}
