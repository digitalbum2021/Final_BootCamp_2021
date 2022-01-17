package common_code;

import org.testng.annotations.Test;

import common_code.BaseCode;
import pages.ExpediaHome;

public class ExpediaTest extends BaseCode {
  @Test
  public void Test1() throws InterruptedException {
	  ExpediaHome obj = new ExpediaHome(driver);
	  
	  obj.selectFlights();
	  obj.selectOrigin("IAD");
	  obj.selectDest("LGA");
	  obj.selectDepDate();
	  obj.clickSearch();
	  Thread.sleep(5000);
  }
}
