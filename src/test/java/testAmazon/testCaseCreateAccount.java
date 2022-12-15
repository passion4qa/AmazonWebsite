package testAmazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseAmazon.baseClassAmazon;
import pomAmazon.pomCreateAccount;

public class testCaseCreateAccount extends baseClassAmazon {
	
	
	public static pomCreateAccount pca;
	
	public testCaseCreateAccount() {
		
		super();
	}

	
	@BeforeClass
	public void initSetup() {
		
		initiation();
		getRegisterUrl();
		pca = new pomCreateAccount();
	}
	
	@Test
	public void VerifyTittle() {
		
		System.out.println("Tittle of the Page");
	}
	
	/*
	 * @Test public void Tc1_ValidData() {
	 * 
	 * 
	 * pca.typeCustomerName("Manish"); pca.typeMobileorEmail("shituqa@gmail.com");
	 * pca.typePassword("mohinip7384"); pca.typeAgainPassword("mohinip7384");
	 * pca.BtnContinue();
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	@Test
	public void Tc2_InvalidEmptyData() throws InterruptedException {
		
		pca.BtnContinue();
		Thread.sleep(5000);
	}
	
	
	
	@AfterClass
	public void Close() {
		
		driver.close();
	}
}
