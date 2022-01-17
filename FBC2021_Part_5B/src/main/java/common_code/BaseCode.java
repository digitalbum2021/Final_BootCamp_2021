package common_code;

import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;

public class BaseCode extends CommonCode {
	//public static WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		selectBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.expedia.com");
		//driver.get("https://www.expedia.com/Flights-Search?leg1=from%3AWashington%20%28DCA%20-%20Ronald%20Reagan%20Washington%20National%29%2Cto%3ANew%20York%2C%20NY%20%28LGA-LaGuardia%29%2Cdeparture%3A2%2F1%2F2022TANYT&leg2=from%3ANew%20York%2C%20NY%20%28LGA-LaGuardia%29%2Cto%3AWashington%20%28DCA%20-%20Ronald%20Reagan%20Washington%20National%29%2Cdeparture%3A2%2F28%2F2022TANYT&mode=search&options=carrier%3A%2A%2Ccabinclass%3A%2Cmaxhops%3A1%2Cnopenalty%3AN&pageId=0&passengers=adults%3A1%2Cchildren%3A0%2Cinfantinlap%3AN&trip=roundtrip");
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}
