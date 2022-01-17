package regresion;

import java.io.IOException;

import org.testng.annotations.Test;
import common_code.AMZBaseCode;
import pages.AMZHome;
import pages.AMZItemPage;
import pages.AMZSearchResults;

public class AMZSearchAndAddTest extends AMZBaseCode {
  @Test(priority=1, alwaysRun=true)
  public void searchTest() throws InterruptedException, IOException {
	  AMZHome obj = new AMZHome(driver);
	  obj.searchText("Macbook pro 16");
	  obj.clickSearch();
	  shots();
  }
  
  @Test(priority=2, alwaysRun=true)
  public void selectItemTest() throws InterruptedException, IOException {
	  AMZSearchResults obj = new AMZSearchResults(driver);
	  obj.selectItem();
	  shots();
  }
  
  @Test(priority=3, alwaysRun=true)
  public void addToCartTest() throws InterruptedException, IOException {
	  AMZItemPage obj = new AMZItemPage(driver);
	  obj.addItemToCart();
	  obj.goToCart();
	  shots();
  }
}
