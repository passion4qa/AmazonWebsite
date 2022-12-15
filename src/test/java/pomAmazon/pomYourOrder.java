package pomAmazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseAmazon.baseClassAmazon;

public class pomYourOrder extends baseClassAmazon{
	
	
	@FindBy(id="nav-link-accountList-nav-line-1")
		WebElement txtUsername;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/h2")
	WebElement txtOrder;
	
	@FindBy(id="orderFilter")
	WebElement txtSearchOrder;
	
	@FindBy(id="orderFilter_0")
	WebElement anch30days;
	
	//Initialize Page Factory
	
		public pomYourOrder() {
			
			PageFactory.initElements(driver, this);
		}
	
		
		public void txtVerify() {
			
				//System.out.println(txtUsername);
				txtUsername.click();
			
		}
		
		public void txtOrderClick() {
			
			txtOrder.click();
		}
		
	public void txtOrderSearch() {
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			//wait.until(ExpectedConditions.elementToBeClickable(By.id("orderFilter_2")));
			//driver.findElement(By.id("orderFilter_2")).click();
		
			//Select obj = new Select(driver.findElement(By.className("a-dropdown-prompt")));
			//obj.selectByIndex(2);
			//anch30days.click();
		
		
		List<WebElement> options = driver.findElements(By.className("a-dropdown-prompt"));
		for(WebElement option : options) {
		if (option.getText().contains("2022")) 
		{
		 option.click();
		 break;
		}
		
		}
		}
	}
		

