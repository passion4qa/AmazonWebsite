package pomAmazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseAmazon.baseClassAmazon;

public class pomCreateAccount extends baseClassAmazon {
		@FindBy(id="ap_customer_name")
		WebElement CustomerName;
		
		
		@FindBy(id="ap_email")
		WebElement Mobilenumberoremail;
		
		@FindBy(xpath="//*[@id=\"ap_password\"]")
		WebElement Password ;
		
		
		@FindBy(id="ap_password_check")
		WebElement Passwordagain;
		
		
		@FindBy(id="continue")
		WebElement Continue;
		
		
		//Initiate Page elements
				public pomCreateAccount() {
					PageFactory.initElements(driver, this);
				}
				
				public void typeCustomerName(String CName) {
					CustomerName.sendKeys(CName);
					
				}
				
				public void typeMobileorEmail(String MEmail) {
					Mobilenumberoremail.sendKeys(MEmail);
					Password.click();
				}
				
				public void typePassword(String password) {
					Password.sendKeys(password);
					
				}
				
				public void typeAgainPassword(String Apassword) {
					Passwordagain.sendKeys(Apassword);
				}
				
				public void BtnContinue() {
					Continue.click();
				}
		
}
