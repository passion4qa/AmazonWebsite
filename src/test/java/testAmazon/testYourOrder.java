package testAmazon;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseAmazon.baseClassAmazon;
import pomAmazon.pomCreateAccount;
import pomAmazon.pomLogin;
import pomAmazon.pomYourOrder;

public class testYourOrder extends baseClassAmazon {

	
public static pomYourOrder pyo;
public static pomLogin pl;
	
	public testYourOrder() {
		
		super();
	}

	
	@BeforeClass
	public void initSetup() {
		
		initiation();
		getLoginUrl();
		pl = new pomLogin();
		pyo = new pomYourOrder();
	}
	
	@Test
	public void VerifyText() throws InterruptedException {
		pl.typeEmail("shituqa@gmail.com");
		pl.clickBtnContinue();
		pl.typePaswword("mohinip7384");
		pl.clickBtnSigin();
		
		pyo.txtVerify();
		Thread.sleep(5000);
		pyo.txtOrderClick();
		
		
		pyo.txtOrderSearch();
	}

}
