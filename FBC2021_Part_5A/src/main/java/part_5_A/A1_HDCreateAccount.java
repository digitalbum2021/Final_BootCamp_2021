package part_5_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1_HDCreateAccount {
	
	public static WebDriver driver;
	
	@FindBy (xpath="//*[@class='form-input__field' and @id='email']") WebElement userEmail;
	@FindBy (xpath="//*[@id='password-input-field']") WebElement userPass;
	@FindBy (xpath="//*[@class='form-input__field' and @id='zipCode']") WebElement userZip;
	@FindBy (xpath="//*[@class='form-input__field' and @id='phone']") WebElement userPhone;
	@FindBy (xpath="(//*[@type='button'])[3]") WebElement kmsiCheckBox;
	@FindBy (xpath="(//*[@type='button'])[4]") WebElement vmmnCheckBox;
	@FindBy (xpath="//*[@data-automation-id='registrationCreateAnAccountButton']") WebElement clickCreate;

	public A1_HDCreateAccount(WebDriver driver) {
		A1_HDCreateAccount.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserEmail(String uEmail) throws InterruptedException {
		userEmail.sendKeys(uEmail);
		Thread.sleep(2000);
	}
	
	public void enterUserPass(String uPass) throws InterruptedException {
		userPass.sendKeys(uPass);
		Thread.sleep(2000);
	}
	
	public void enterUserZip(String uZip) throws InterruptedException {
		userZip.sendKeys(uZip);
		Thread.sleep(2000);
	}
	
	public void enterUserPhone(String uPhone) throws InterruptedException {
		userPhone.sendKeys(uPhone);
		Thread.sleep(2000);
	}
	
	public void selectKMSICheckBox() throws InterruptedException {
		kmsiCheckBox.click();
		Thread.sleep(2000);
	}
	
	public void selectVMMNCheckBox() throws InterruptedException {
		vmmnCheckBox.click();
		Thread.sleep(2000);
	}
	
	public void createNewAccount() throws InterruptedException {
		clickCreate.click();
		Thread.sleep(2000);
	}

}
