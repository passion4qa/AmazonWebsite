package pomAmazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseAmazon.baseClassAmazon;

public class pomLogin extends baseClassAmazon {
	
	
	@FindBy(xpath="//*[@id=\"ap_email\"]")
	WebElement CustomerEmail;
	
	
	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement btnContinue;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement btnsigin;
	
	//Initialize Page Factory
	
	public pomLogin() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String Email) {
		CustomerEmail.sendKeys(Email);
	}
	public void clickBtnContinue() {
		btnContinue.click();
	}
	
	
	public void clickBtnSigin() {
		btnsigin.click();
	}
	
	
	public void typePaswword(String Pass) {
		Password.sendKeys(Pass);
	}
}
