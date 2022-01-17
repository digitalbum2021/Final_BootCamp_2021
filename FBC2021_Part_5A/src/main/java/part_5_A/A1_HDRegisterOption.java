package part_5_A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1_HDRegisterOption {
	
	public static WebDriver driver;
	
	@FindBy (xpath="(//*[@class='bttn__content'])[1]") WebElement personal;
	
	public A1_HDRegisterOption(WebDriver driver) {
		A1_HDRegisterOption.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectPersonal() throws InterruptedException {
		personal.click();
		Thread.sleep(2000);
	}

}
