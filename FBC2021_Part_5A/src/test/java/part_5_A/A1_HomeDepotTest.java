package part_5_A;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A1_HomeDepotTest extends A1_HomeDepotBaseClass{
  @Test (priority=1)
  public void TestHomePage() throws InterruptedException {
	  A1_HDHomePage obj = new A1_HDHomePage(driver);
	  obj.clickMyAccount();
	  obj.clickRegister();
	  
  }
  @Test (priority=2)
  public void TestRegisterOptionSelect() throws InterruptedException {
	  A1_HDRegisterOption obj = new A1_HDRegisterOption(driver);
	  obj.selectPersonal();
	  
  }
  @Test (priority=3)
  @Parameters({"uEmail","uPass","uZip","uPhone"})
  public void TestCreateAccount(String uEmail, String uPass, String uZip, String uPhone) throws InterruptedException {
	  A1_HDCreateAccount obj = new A1_HDCreateAccount(driver);
	  
	  obj.enterUserEmail(uEmail);
	  obj.enterUserPass(uPass);
	  obj.enterUserZip(uZip);
	  obj.enterUserPhone(uPhone);
	  obj.selectKMSICheckBox();
	  obj.selectVMMNCheckBox();
	  obj.createNewAccount();
	  
  }
}
