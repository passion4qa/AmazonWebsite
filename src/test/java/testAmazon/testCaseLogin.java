package testAmazon;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseAmazon.baseClassAmazon;
import pomAmazon.pomCreateAccount;
import pomAmazon.pomLogin;

public class testCaseLogin extends baseClassAmazon {

	public static pomLogin pl;
	  public testCaseLogin() {
		  super();
	  }
	  
	  @BeforeClass
		public void initSetup() {
			
			initiation();
			getLoginUrl();
			pl = new pomLogin();
		}
	  
	  @Test
	  
	  public void ValidData() {
		  pl.typeEmail("shituqa@gmail.com");
		  pl.clickBtnContinue();
		  pl.typePaswword("mohinip7384");
		  pl.clickBtnSigin();
	  }
}
